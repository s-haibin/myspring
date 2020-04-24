package com.hb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyspringApplication {


//    @RequestMapping(value = "hello")
//    @ResponseBody
//    public String Hello(){
//        return "Heoll Spring Boot";
//    }

	public static void main(String[] args) {
	    SpringApplication.run(MyspringApplication.class, args);
	}

}
