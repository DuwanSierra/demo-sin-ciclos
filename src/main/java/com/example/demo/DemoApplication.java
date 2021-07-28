package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		print(5);
		SpringApplication.run(DemoApplication.class, args);
	}

	public static void print(Integer finalNumber){
		createRow(null,0,finalNumber);
	}

	public static String createRow(String initial,Integer initialNumber, Integer total){
		String auxInitial = initial;
		if(auxInitial == null){
			auxInitial = "";
		}
		if(initialNumber<total){
			auxInitial = auxInitial + "*";
			System.out.println(auxInitial);
			createRow(auxInitial,initialNumber+1,total);
		}
		return auxInitial;
	}

}
