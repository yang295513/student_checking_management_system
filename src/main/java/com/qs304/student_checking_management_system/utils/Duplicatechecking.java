package com.qs304.student_checking_management_system.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class Duplicatechecking {

    private Set<String> source;
    private Set<String> targer;
    private Set<Character> symbols;

    //初始化
    private void Init() {
        source = new TreeSet<String>();
        targer = new TreeSet<String>();
        symbols = new TreeSet<Character>();
        symbols.add(',');
        symbols.add('，');
        symbols.add('。');
        symbols.add('.');
        symbols.add('!');
        symbols.add('！');
        symbols.add('？');
        symbols.add('?');
        symbols.add('<');
        symbols.add('>');
        symbols.add('《');
        symbols.add('》');
        symbols.add('(');
        symbols.add('（');
        symbols.add(')');
        symbols.add('）');
    }

    /**
     * 和本地文件查重
     *
     * @param sourceString
     * @return
     */
    public Double localCompare(String sourceString,Integer level) throws Exception {
        File file = new File("src/main/resources/file");
        File[] files = file.listFiles();

        Double repetition=0.0;

        for (File file1 : files) {
            String targetSource=new String();
            String itemString;
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file1));

            while((itemString=bufferedReader.readLine())!=null){
                targetSource+=itemString;
            }

            bufferedReader.close();


            Double item=compare(sourceString,targetSource,level);


            if(repetition<item){
                repetition=item;
            }
        }

        return repetition;
    }

    /**
     * 查重
     *
     * @param sourceString
     * @param targetString
     * @param level
     * @return
     */
    public Double compare(String sourceString, String targetString, Integer level) throws Exception {
        Init();
        int count = 0;//重复率

        if (sourceString.length() > targetString.length()) {
            String item = sourceString;
            sourceString = targetString;
            targetString = item;
        }

        sourceString=removeSpace(sourceString);
        targetString=removeSpace(targetString);

        cutting(sourceString, targetString, level);
        for (String s : source) {
            if (targer.contains(s) == true) {
                count++;
            }
        }

//        Set<String> rel=new TreeSet<>();
//        rel.addAll(source);
//        rel.addAll(targer);

//        System.out.println(count + "--" + source.size());

        return new Double(count / (double) (source.size()));
    }

    /**
     * 切割文本
     */
    private void cutting(String sourceString, String targetString, Integer level) {

        int flag = 0;

        for (int i = 0; i < sourceString.length(); ) {
            String str = new String();
            int j;
            for (j = i; j < sourceString.length(); j++) {
                if (sourceString.charAt(j) != ' ' && sourceString.charAt(j) != '\n' && sourceString.charAt(j) != '\r') {
                    if (str.length() == level || isSymbol(sourceString.charAt(j)) == true) {
                        source.add(str);
                        i = j + 1;
                        break;
                    }
                    str = str + sourceString.charAt(j);
                }
            }
            if (j >= sourceString.length() - 1) {
                source.add(str);
                flag = 1;
                break;
            }
            if (flag == 1)
                break;
        }
        flag = 0;
        for (int i = 0; i < targetString.length(); ) {
            String str = new String();
            int j;
            for (j = i; j < targetString.length(); j++) {
                if (targetString.charAt(j) != ' ' && targetString.charAt(j) != '\n' && targetString.charAt(j) != '\r') {
                    if (str.length() == level || isSymbol(targetString.charAt(j)) == true) {
                        targer.add(str);
                        i = j + 1;
                        break;
                    }
                    str = str + targetString.charAt(j);
                }
                if (j >= targetString.length() - 1) {
                    targer.add(str);
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                break;
        }

        for (String s : source) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------------------");
        for (String s : targer) {
            System.out.println(s);
        }

    }

    public Boolean isSymbol(Character a) {
        if (symbols.contains(a)) {
            return true;
        }
        return false;
    }

    public String removeSpace(String str){
        int len=str.length();
        String rel=new String();
        for(int i=0;i<len;i++){
            if(str.charAt(i)!=' '&&str.charAt(i)!='\n'){
                rel+=str.charAt(i);
            }
        }
        return rel;
    }

}
