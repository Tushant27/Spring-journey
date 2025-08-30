package com.tushant.Springboot_RESTAPI;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student,Integer> {
}



/* <dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency> */