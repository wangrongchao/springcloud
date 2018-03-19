package com.onefew.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("com.onefew.springboot.mapper")
public class DemoSpringBoot1fewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBoot1fewApplication.class, args);

//		SpringApplicationBuilder builder = new SpringApplicationBuilder(DemoSpringBoot1fewApplication.class);
//		//修改Banner的模式为OFF
//		builder.bannerMode(Banner.Mode.CONSOLE).run(args);
	}
}
