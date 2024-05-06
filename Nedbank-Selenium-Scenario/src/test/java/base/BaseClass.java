package base;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public static ChromeDriver webDriver;
    public static String url;
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/test/resources/configs/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        url = properties.getProperty("url");
    }
}
