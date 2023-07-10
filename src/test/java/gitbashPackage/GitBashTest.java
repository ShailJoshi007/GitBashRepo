package gitbashPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitBashTest {

	
		//pull back
		WebDriver driver=null;
		
		@Test
		public void m1()
		{
			System.out.println("Hello to push from Gitbash");
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			//String BROWSER = System.getProperty("browser");
		
		}

	

}
