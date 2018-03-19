package com.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestSpbootApplication {


	@Value(value = "${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;
	@Value("${book.pinyin}")
	private String bookPinYin;

	public static void main(String[] args) {
		//SpringApplication.run(TestSpbootApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(TestSpbootApplication.class);
		//修改Banner的模式为OFF
		builder.bannerMode(Banner.Mode.LOG).run(args);
	}

	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index(){
		return "Hello Spring Boot! The BookName is "+bookName+";and Book Author is "+bookAuthor+";and Book PinYin is "+bookPinYin;
	}
}
