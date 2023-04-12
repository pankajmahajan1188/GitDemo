package PavanTestingTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Chrome Browser --> chromedriver.exe    Firefox -->geckodriver    Edge-->edgedriver.exe
//webdriver(interface)  Chromedriver,firefoxdriver,edgedriver(class) these 3 classses implements webdriver interface

public class Basic1 {

	public static void main(String[] args)
	{ 
		//chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeDriver driver=new ChromeDriver();
		webdriver.ChromeDriver driver=new ChromeDriver(); //launch the browser
		
		//chrome firefox
		
		driver.get("www.google.com"); 
		
		//using webdriver manager
		WebDriverManager.chromedriver().setup()
		webdriver driver=new chromedriver()
		
		System.out.println("Title of web page is : "+driver.getTitle());
		System.out.println("Current URL of web page"+driver.getCurrentUrl());
		System.out.println(driver.pageresource());
	}
}
