package com.dawa.admin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // spring boot 자동 설정, 이 Annotation이 있는 위치부터 설정을 읽어가기 때문에 프로젝트 최상단에 위치해야 함.
public class Application { // this class is main class
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
