package com.hsx.easyui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.hsx.easyui.mapper" })
public class EasyUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyUiApplication.class, args);
	}

}
