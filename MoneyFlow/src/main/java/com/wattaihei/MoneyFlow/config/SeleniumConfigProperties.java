package com.wattaihei.MoneyFlow.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

@Component
@ConstructorBinding
@ConfigurationProperties(prefix = "selenium")
public class SeleniumConfigProperties {
    private String chromeDriverPath;

    public String getChromerDriverPath() {
        return chromeDriverPath;
    }

    public void setChromeDriverPath(String chromeDriverPath) {
        this.chromeDriverPath = chromeDriverPath;
    }
}
