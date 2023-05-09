package com.hong.ITBloging.crawling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

@Component
public class CrawlingConfig {

    private WebDriver driver;
    private static final String URL = "https://www.google.co.kr/";

    //크롬버전 100번대 이후로는 Option을 추가해주어야함
    private ChromeOptions getOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return options;
    }
    public void process(){
        System.setProperty("webdriver.chrome.driver","C:\\javas\\chromedriver.exe");
        //System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions options = getOptions();
        driver = new ChromeDriver(options);
        //driver.close();
        //driver.quit();
    }

}
