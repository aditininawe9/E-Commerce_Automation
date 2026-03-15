package com.testingacademy.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
    Properties prop;

    public configReader() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/main/Resources/config.properties");
            prop.load(fis);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return prop.getProperty("baseUrl");
    }

}
