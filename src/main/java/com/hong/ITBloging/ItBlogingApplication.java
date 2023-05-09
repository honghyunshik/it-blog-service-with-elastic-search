package com.hong.ITBloging;

import com.hong.ITBloging.crawling.CrawlingConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItBlogingApplication {

	public static void main(String[] args) {

		CrawlingConfig crawlingConfig = new CrawlingConfig();
		crawlingConfig.process();
		SpringApplication.run(ItBlogingApplication.class, args);
	}

}
