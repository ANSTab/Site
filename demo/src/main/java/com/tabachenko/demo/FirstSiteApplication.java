package com.tabachenko.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FirstSiteApplication {

	public FirstSiteApplication() throws IOException {
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstSiteApplication.class, args);
	}






}
