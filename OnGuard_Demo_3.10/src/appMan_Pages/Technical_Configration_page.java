package appMan_Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Configration_Files.Common;
import Configration_Files.WebDriverManager;
import Event_commands.events;
public class Technical_Configration_page {
	WebDriverManager mgr= new WebDriverManager();
	Common c = new Common();
	final WebDriver driver;
	public  Technical_Configration_page(WebDriver driver)
	{   
		this.driver = driver;
	}
  @Test
  public void Licence_Maintenance_Tab() throws InterruptedException {
	  events eve =new events(driver);
	  eve.Click_event("TC_licence_Main");
	  Reporter.log("Licence Maintenance Tab is clicked");
	  
  }
  @Test
  public void Req_Server_Settings_Tab() throws InterruptedException {
	  events eve =new events(driver);
	  eve.Click_event("TC_Req_Server_settgs");
  }
  @Test
  public void Client_Settings_Tab() throws InterruptedException {
	  events eve =new events(driver);
	  eve.Click_event("TC_Client_settgs");
  }
  @Test
  public void Email_Servers_Tab() throws InterruptedException {
	  events eve =new events(driver);
	  eve.Click_event("TC_Email_servers");
  }
  @Test
  public void Printers_Tab() throws InterruptedException {
	  events eve =new events(driver);
	  eve.Click_event("TC_printers");
	  Reporter.log("Printers tab is Clicked");
  }
  
  @Test
  public void API_Client_Tab() throws InterruptedException {
	  events eve =new events(driver);
	  eve.Click_event("TC_api_c");
	  Reporter.log("API Client tab is Clicked");
  }
  @Test
  public void Notification_Message() {
	  events eve =new events(driver);
	  eve.GetText_event("TC_Notification_Message");
  }
  @Test
  public void Save_Notification_Yes() throws InterruptedException {
	  events eve =new events(driver);
	  eve.Click_event("TC_Notification_Yes_button");
  }
  @Test
  public void Save_Notification_NO() throws InterruptedException {
	  events eve =new events(driver);
	  eve.Click_event("TC_Notification_No_button");
  }
  @Test
  public void Save_Notification_Cancel() throws InterruptedException {
	  events eve =new events(driver);
	  eve.Click_event("TC_Notification_Cancel_button");
  }
}
