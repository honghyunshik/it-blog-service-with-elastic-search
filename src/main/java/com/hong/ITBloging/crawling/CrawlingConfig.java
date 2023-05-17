package com.hong.ITBloging.crawling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

//@Component
public class CrawlingConfig {

    /*
    private WebDriver driver;
    private static final String VELOG = "https://velog.io/";

    //크롬버전 100번대 이후로는 Option을 추가해주어야함
    private ChromeOptions getOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return options;
    }
    public void process(){
        System.setProperty("webdriver.chrome.driver","C:\\javas\\chromedriver.exe");

        ChromeOptions options = getOptions();
        driver = new ChromeDriver(options);
        try{
            make_velog_set();
        }catch (Exception e){

        }
        //driver.close();
        //driver.quit();
    }

    //Velog는 무한스크롤로 구성
    //페이지를 내려가며 작성자들을 set에 저장
    private HashSet<String> make_velog_set() throws InterruptedException {

        HashSet<String> set = new HashSet<>();

        driver.get(VELOG);

        //게시글을 올해로 변경
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[1]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[1]/div[1]/div[3]/div/div/ul/li[4]")).click();
        Thread.sleep(1000);
        int now = (int) new Date().getTime();
        WebElement item = driver.findElement(By.className("sc-lbhJGD"));

        //무한스크롤 미리 내리기
        while((int)new Date().getTime()<now + 60000){

            Thread.sleep(500);
            ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)",item);
        }
        Thread.sleep(5000);

        List<WebElement> elementList = driver.findElements(By.className("sc-lbhJGD"));

        for(WebElement element:elementList){
            String ele = element.findElement(By.className("sc-jeraig")).findElement(By.className("userinfo")).getAttribute("href");
            System.out.println(ele);
            set.add(ele);
        }


        //velog 블로그 487개 크롤링
        System.out.println("사이즈 : " + set.size());


        return set;

    }
    */




}
