package com.qs304.student_checking_management_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qs304.student_checking_management_system.mapper")
public class StudentCheckingManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentCheckingManagementSystemApplication.class, args);
    }

}
