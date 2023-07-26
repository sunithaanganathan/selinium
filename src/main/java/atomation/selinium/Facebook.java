package atomation.selinium;
import java.io.FileInputStream ;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
	
	public void book()
	 { 
		WebDriver browser=new ChromeDriver();
		browser.get("https://www.google.com/");
		browser.manage().window().maximize();
		
	 }
	 public void bookr()
	 {
		    WebDriver browser=new EdgeDriver();
			browser.get("https://www.fb.com/");
			browser.manage().window().maximize(); 
	 }
	
	public static void main(String[]arg) throws IOException {
		
		String filepath= "C:\\Users\\sunit\\OneDrive\\Desktop\\java\\selinium\\sunitha\\pro.properties";
		Facebook obj =new Facebook();
		FileInputStream FS=new FileInputStream(filepath);
		Properties p=new Properties();
		p.load(FS);
	
		if(p.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			
		     obj.book();
		}
		else
		{
			 obj.bookr();
		}
		
	
	}
  
	
}
