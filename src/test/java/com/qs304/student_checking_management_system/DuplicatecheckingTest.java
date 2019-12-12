package com.qs304.student_checking_management_system;

import com.qs304.student_checking_management_system.utils.Duplicatechecking;
import org.junit.Test;

public class DuplicatecheckingTest {

    Duplicatechecking duplicatechecking=new Duplicatechecking();

    @Test
    public void test() throws Exception {

        String a="如果底层流上的第一个read返回-1以指示文      件结束，则此方法返回-1 。 否则，此方法返回实际读取的字符数。 \n" +
                "鼓励这个类的子类，但不是必需的，尝试以相同的方式读取尽可能多的字符。 \n" +
                "\n" +
                "通常这种方法从这个流的字符缓冲区中获取字符，并根据需要从底层流中填充它。 但是，如果缓冲区为空，则该标记无效，并且所请求的长度至少与缓冲区一样大，则该方法将直接从基础流中读取字符到给定的数组中。 因此冗余BufferedReader将不会不必要地复制数据。\n";
        String b="如果底层流上的第一个read返回-1以指示文件结束，则此方法返回-1 。 否则，此方法返回实际读取的字符数。 \n" +
                "鼓励这个类的子类，但不是必需的，尝试以相同的方式读取尽可能多的字符。 \n" +
                "\n" +
                "通常这种方法从这个流的字符缓冲区中获取字符，     。 但是，如果缓冲区为空，     ，并且所请求的长度至少与缓冲区一样大，晚上打算打发斯蒂芬。因此冗余BufferedReader将不会不必要地复制数据。\n";

//        System.out.println(duplicatechecking.localCompare("版权声明：本文为CSDN博主「Mr_Leeeee」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。",10));
        System.out.println(duplicatechecking.compare(a,b,10));
    }

}
