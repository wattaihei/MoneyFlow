package com.wattaihei.MoneyFlow.fetcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

import com.wattaihei.MoneyFlow.config.EposConfigProperties;
import com.wattaihei.MoneyFlow.config.SeleniumConfigProperties;

@Component
public class EposFetcher implements Fetcher {
    private final SeleniumConfigProperties seleniumConfigProperties;

    private final EposConfigProperties eposConfigProperties;

    public EposFetcher(SeleniumConfigProperties seleniumConfigProperties,
                    EposConfigProperties eposConfigProperties) {
        this.seleniumConfigProperties = seleniumConfigProperties;
        this.eposConfigProperties = eposConfigProperties;
    }


    @Override
    public void run() {
        String PATH = seleniumConfigProperties.getChromerDriverPath();
        System.setProperty("webdriver.chrome.driver", PATH);
        WebDriver driver = new ChromeDriver();

        String url = eposConfigProperties.getLoginUrl();
        
        // open page
        driver.get(url);

        WebElement usernameElement = driver.findElement(By.name("loginId"));
        usernameElement.sendKeys(eposConfigProperties.getUsername());
        WebElement passwordElement = driver.findElement(By.name("passWord"));
        passwordElement.sendKeys(eposConfigProperties.getPassword());

        WebElement loginButtonElement = driver.findElement(By.xpath("//*[@id=\"mainContents\"]/div[1]/div[1]/div/div/form/p/a"));
        loginButtonElement.click();

    }
}
