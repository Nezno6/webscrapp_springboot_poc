package edu.zdam.webscraping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebscrapingApplication {
	static {
		System.setProperty(
				"webdriver.chrome.driver",
				"E:\\programy\\selenium-webdriver\\chromedriver.exe"
		);
	}

	public static void main(String[] args) {
		SpringApplication.run(WebscrapingApplication.class, args);
	}

}
