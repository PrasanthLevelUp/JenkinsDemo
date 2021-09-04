package levelUp.JenkinsProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void MyTestMethod() {
	  System.out.println("Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Test");
  }

}
