package TestList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\My_Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Html/Test.html");
		String myTitle = driver.getTitle();
		System.out.println (myTitle);
		List <WebElement> myOptions = driver.findElements (By.tagName("option"));

		for (int i =0 ; i< myOptions.size();i++) {
			System.out.println (myOptions.get(i).getText());
			System.out.println (myOptions.get(i).getAttribute("value"));

		}
	}

}
