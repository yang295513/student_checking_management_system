package com.qs304.student_checking_management_system;

import com.qs304.student_checking_management_system.utils.Duplicatechecking;
import org.junit.Test;

public class DuplicatecheckingTest {

    Duplicatechecking duplicatechecking=new Duplicatechecking();

    @Test
    public void test() throws Exception {

        String a="栈是一种先进后出（FILO，First In Last Out）的数据结构．如下图1,2,3,4顺序进栈，那么一种可能的进出栈顺序是：1In→2In→2Out→3In→4In→4Out→3Out→1Out1In→2In→2Out→3In→4In→4Out→3Out→1Out1In→2In→2Out→3In→4In→4Out→3Out→1Out, 于是出栈序列为1,3,4,2。对于一个还有nnn个数的数组来说，假设第kkk个为最后出栈那么有f(k)f(k)f(k)在它前面出栈，以及f(n−k)f(n-k)f(n−k)在它后面出栈，因此对于第k个数最后出栈它有f(k)f(n−k)f(k)f(n-k)f(k)f(n−k)种方式，又因为所以数可能是最后一个出栈因此所有可能就是一个卡特兰数。\n" +
                "————————————————\n" +
                "版权声明：本文为CSDN博主「Mr_Leeeee」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。\n" +
                "原文链接：https://blog.csdn.net/zhenguipa8450/article/details/88828265";
       String b="";;

//        System.out.println(duplicatechecking.localCompare("版权声明：本文为CSDN博主「Mr_Leeeee」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。",10));
        System.out.println(duplicatechecking.compare(a,b,6));
    }

}
