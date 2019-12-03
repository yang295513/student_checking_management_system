package com.qs304.student_checking_management_system;

import com.qs304.student_checking_management_system.service.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sql {

    @Autowired
    Service service;

    @Test
    public void getCurInfoById(){
        System.out.println(service.getCurInfoByCurId(3));
    }

}
