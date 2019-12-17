package com.qs304.student_checking_management_system.utils;


import org.apache.poi.hwpf.extractor.WordExtractor;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;


public class ReadWord {
    public String doc = "doc";

    public String readWord(InputStream inputStream, String suffix) {
        String buffer = "";
        try {
            if (suffix.equals("doc")) {
                WordExtractor ex = new WordExtractor(inputStream);
                buffer = ex.getText();
                ex.close();
            }else {
                System.out.println("格式不合法");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


//        System.out.println(buffer);
        try {
            String rel=new String(buffer.getBytes(),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
