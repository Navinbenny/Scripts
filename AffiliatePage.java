package com.ykss.automation.appModules;

import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.ykss.automation.bookingFlow.IndexPage;

public class AffiliatePage {
  
  @BeforeMethod
  	public static void beforeMethod()
  	{
	    System.out.println("AffiliatePage started here...."); 
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium-libraries\\chromedriver.exe");
	    IndexPage.driver = new ChromeDriver();
	    IndexPage.driver .manage().window().maximize();
	    IndexPage.driver .get("http://localhost:8080/bus/affiliatehome.htm");
  	}
//Common class for login as affilaite
	    public static void affiliateLogin() throws InterruptedException
	      {
			 	System.out.println("AffiliateLogin functionality starts here....");
			 	IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 	IndexPage.driver.findElement(By.className("loginBtn")).click();
			 	IndexPage.driver.findElement(By.name("email_2")).sendKeys("reddynaveen19@gmail.com");
				IndexPage.driver.findElement(By.name("pwd_2")).sendKeys("123456");
				IndexPage.driver.findElement(By.id("bt_2")).click();
			 	Thread.sleep(5000);

	     }
  
//-------------------------------------------------------------------------------------
														//TO TEST AFFILIATE REGISTRATION 
@Test(enabled=false)
//@Test(groups = "AffiliatePage")//Execution start from here
//@Test	  
  
  	public static void affiiateRegister()
  		{
	  
	      try
	      {
	    	 System.out.println("affiiateRegister functionality starts here....");  
	    	 IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='AffiliateProgram_Agreement.htm']")).click();
	    	 //Affiliate partners
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='AffiliateProgram_Agreement.htm']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://www.onlinelocaldeals.com']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://bigbusinesshub.com']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://www.indianbustickets.com']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://smartway2shopping.weebly.com/busflights--hotels.html']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://couponzlot.blogspot.in']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://travelportalz.blogspot.in']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://www.karaikalindia.com']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://www.sahajyatra.in/bus.html']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://blog.etravelsmart.com']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://www.travelspoint.co.in/tour.php']")).click();
	    	 IndexPage.driver.findElement(By.cssSelector("a[href*='http://www.allbusoffers.com/etravelsmart.html']")).click();
	    	 //Registration starts from here
	    	 IndexPage.driver.findElement(By.className("registerBtn")).click();
	    	 IndexPage.driver.findElement(By.id("affiliatedone")).click();
	    	 String error_popup = IndexPage.driver.findElement(By.xpath("//*[@id='pop']")).getText().toString();
	    	 System.out.println(error_popup);
	    	 Thread.sleep(3000);
	    	 IndexPage.driver.findElement(By.className("ui-button-text-only")).click(); 
	    	 IndexPage.driver.findElement(By.name("affiliateName")).sendKeys("Naveen reddy");
	    	 IndexPage.driver.findElement(By.name("affiliateLoginID")).sendKeys("Naveentest01");
	    	 IndexPage.driver.findElement(By.name("affiliateEmail")).sendKeys("reddynaveen19@gmail.com");
	    	 IndexPage.driver.findElement(By.name("affiliatePassword")).sendKeys("123456");
	    	 IndexPage.driver.findElement(By.name("affiliateConfirmPassword")).sendKeys("123456");
	    	 IndexPage.driver.findElement(By.name("affiliateMobile")).sendKeys("9963367842");
	    	 IndexPage.driver.findElement(By.name("affiliateCity")).sendKeys("hyderabad");
	    	 IndexPage.driver.findElement(By.name("affiliateState")).sendKeys("telangana");
	    	 IndexPage.driver.findElement(By.name("affiliateAddress")).sendKeys("kphb,hmt sathavahana nagar,juntu,hyderabad.");
	    	 IndexPage.driver.findElement(By.name("affiliateCompanyName")).sendKeys("Yk software solutions");
	    	 IndexPage.driver.findElement(By.name("affiliateSiteUrl")).sendKeys("http://www.etravelsmart.com");
	    	 IndexPage.driver.findElement(By.name("captchaText")).sendKeys("");
	    	 IndexPage.driver.findElement(By.id("affiliatedone")).click();
	    	 String success_popup = IndexPage.driver.findElement(By.xpath("//*[@id='pop']")).getText().toString();
	    	 System.out.println(success_popup);
	    	 Thread.sleep(3000);
	    	 IndexPage.driver.findElement(By.className("ui-button-text-only")).click();
	    	 ///html/body/div[9]/div[11]/div/button/span
	    	 IndexPage.driver.findElement(By.className("formSubmit")).click();
	    	 System.out.println("affiiateRegister functionality ends here....");  
	  
	      }  
	      catch(Exception affiiateregister)
	      {
	    	  affiiateregister.printStackTrace();
	    	  System.out.println(affiiateregister);
	    	  
	      }	  
  			}
//-------------------------------------------------------------------------------------
															//TO TEST AFFILIATE LOGIN 
//@Test	    
@Test(enabled=false)
//@Test(dependsOnGroups="AffiliatePage")

			public static void affiiateLoginPage()
			{

				try
					{
					 System.out.println("affiiateLoginPage functionality starts here....");
					 IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					 IndexPage.driver.findElement(By.className("loginBtn")).click();
					 IndexPage.driver.findElement(By.id("bt_2")).click();
					 String Error_status = IndexPage.driver.findElement(By.xpath("//*[@id='pop']")).getText().toString();
					 System.out.println(Error_status);
					 IndexPage.driver.findElement(By.className("ui-button-text-only")).click();
					 IndexPage.driver.findElement(By.name("email_2")).sendKeys("reddynaveen19@gmail.com");
					 IndexPage.driver.findElement(By.name("pwd_2")).sendKeys("1234567");
					 IndexPage.driver.findElement(By.id("bt_2")).click();
					 System.out.println("affiiateLoginPage functionality ends here....");  
					
					
					}
                 catch(Exception affiiateLoginPage)
                 {
                	 
                	 affiiateLoginPage.printStackTrace();
       	    	     System.out.println(affiiateLoginPage);
                	 
                 }
					
					
			}
//-------------------------------------------------------------------------------------
													//TO TEST AFFILIATE FORGOT PASSWORD 
//@Test	    
@Test(enabled=false)
//@Test(dependsOnGroups="AffiliatePage")

		public static void affiiateFrgtPwd()
		{

			try
				{
				  System.out.println("affiiateFrgtPwd functionality starts here....");
				  IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  IndexPage.driver.findElement(By.className("loginBtn")).click();
				  IndexPage.driver.findElement(By.id("forgot_pwd")).click();
				  IndexPage.driver.findElement(By.name("ForgotEmail")).sendKeys("reddynaveen18@gmail.com");
				  IndexPage.driver.findElement(By.id("Forgotpassworddone")).click();
				  String Frgtpwd_error = IndexPage.driver.findElement(By.xpath("//*[@id='Forgot_Pwd_div']/li[1]/div")).getText().toString();
				  System.out.println(Frgtpwd_error);
				  System.out.println("affiiateFrgtPwd functionality ends here....");
				
				}
				
				
            catch(Exception affiiateFrgtPwd)
            {
            	affiiateFrgtPwd.printStackTrace();
  	    	     System.out.println(affiiateFrgtPwd);
            }


		}

//-------------------------------------------------------------------------------------
														//TO TEST AFFILIATE PROFILE PAGE 
@Test	    
//@Test(enabled=false)
//@Test(dependsOnGroups="AffiliatePage")

			public static void affiiateProfilePage()
				{

					try
							{
								System.out.println("affiiateProfilePage functionality starts here....");
								IndexPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
								AffiliatePage.affiliateLogin();
								IndexPage.driver.findElement(By.id("affiliateEditProfileBtn")).click();
								WebElement name = IndexPage.driver.findElement(By.name("myprofile_name"));
								name.clear();
								name.sendKeys("Navin reddy");
								WebElement mobilenumber = IndexPage.driver.findElement(By.name("myprofile_mobilenumber"));
								mobilenumber.clear();
								mobilenumber.sendKeys("9963367842");
								WebElement city = IndexPage.driver.findElement(By.name("myprofile_city"));
								city.clear();
								city.sendKeys("Hyderabad");
								Robot dropdown = new Robot();
								dropdown.keyPress(KeyEvent.VK_DOWN);
								dropdown.keyRelease(KeyEvent.VK_DOWN);
								dropdown.keyPress(KeyEvent.VK_ENTER);
								dropdown.keyRelease(KeyEvent.VK_ENTER);
								WebElement state = IndexPage.driver.findElement(By.name("myprofile_state"));
								state.clear();
								state.sendKeys("Telangana");
								Robot statedropdown = new Robot();
								statedropdown.keyPress(KeyEvent.VK_DOWN);
								statedropdown.keyRelease(KeyEvent.VK_DOWN);
								statedropdown.keyPress(KeyEvent.VK_ENTER);
								statedropdown.keyRelease(KeyEvent.VK_ENTER);
								//Thread.sleep(2000);
								WebElement address = IndexPage.driver.findElement(By.id("myprofile_address"));
								address.clear();
								address.sendKeys("kphb,hmt sathavahana nagar,juntu,hyderabad.");
								WebElement comapanyname = IndexPage.driver.findElement(By.name("myprofile_comapanyname"));
								comapanyname.clear();
								comapanyname.sendKeys("Yk software solutions");
								WebElement websiteurl = IndexPage.driver.findElement(By.name("myprofile_websiteurl"));
								websiteurl.clear();
								websiteurl.sendKeys("http://www.etravelsmart.com/bus/");
								WebElement accountName = IndexPage.driver.findElement(By.name("affiliate_accountName"));
								accountName.clear();
								accountName.sendKeys("HFDC");
								WebElement accountNumber = IndexPage.driver.findElement(By.name("affiliate_accountNumber"));
								accountNumber.clear();
								accountNumber.sendKeys("501000758765421");
								WebElement ifcsCode = IndexPage.driver.findElement(By.name("affiliate_ifcsCode"));
								ifcsCode.clear();
								ifcsCode.sendKeys("HDFC005247");
								WebElement bankbranchName = IndexPage.driver.findElement(By.name("affiliate_bankbranchName"));
								bankbranchName.clear();
								bankbranchName.sendKeys("Jubliee Hills");
								IndexPage.driver.findElement(By.id("affiliateEditProfile")).click();
								WebElement Edit_Status = IndexPage.driver.findElement(By.xpath("//*[@id='pop']"));
								System.out.println(Edit_Status.getText());
								IndexPage.driver.findElement(By.className("ui-button-text-only")).click();
								
							//Change Password starts here
								
								IndexPage.driver.findElement(By.xpath("//*[@id='tab-ct']/li[1]/div[1]/div[2]")).click();
								IndexPage.driver.findElement(By.name("oldPw")).sendKeys("1234567");
								IndexPage.driver.findElement(By.name("newPw")).sendKeys("123456");
								IndexPage.driver.findElement(By.name("confNewPw")).sendKeys("123456");
								IndexPage.driver.findElement(By.id("Change_Password")).click();
								Thread.sleep(3000);
								
							//For password change status this will work individually
								
								/*WebElement New_pwdstatus = findElementIfPresent(IndexPage.driver, By.id("pop"));
								System.out.println(New_pwdstatus.getText());
								IndexPage.driver.findElement(By.className("ui-button-text-only")).click();*/
							// For Changing new password status   
								/*if(New_pwdstatus != null && New_pwdstatus.getText().matches("Your Password Has Been Updated Successfully ")){
							    	 System.out.println("Displayed new password status as expected.");
							     }else{
							    	 System.out.println("Excepted : Your Password Has Been Updated Successfully ");
							     }*/
								
								
				
								WebElement wrngold_pwdstatus = findElementIfPresent(IndexPage.driver, By.id("pw-status-box"));
								System.out.println(wrngold_pwdstatus.getText());
				
								WebElement wrngnew_pwdstatus = findElementIfPresent(IndexPage.driver, By.className("errorVdn"));
								System.out.println(wrngnew_pwdstatus.getText());
		
							// For Wrong new password and wrong old password status	
							   if(wrngnew_pwdstatus != null && wrngnew_pwdstatus.getText().matches("The new password and confirm new password should be the same."))
								  {
								    	 System.out.println("Displayed wrong new password status as expected.");
						       }else if(wrngold_pwdstatus != null && wrngold_pwdstatus.getText().matches("Sorry:you provided an incorrect old password. Please try again."))
								     {
								    	 System.out.println("Displayed wrong old and new password status as expected.");
								    	 
								     } else{
								    	 System.out.println("Excepted : The new password and confirm new password should be the same.");
								    	 System.out.println("Excepted : Sorry:you provided an incorrect old password. Please try again.");
								    	 
								     }
							   
							//For Wrong old and new password status	 this will work individually 
							   /*WebElement wrngoldnew_pwdstatus = findElementIfPresent(IndexPage.driver, By.xpath("//*[@id='change_pwd_form']/table/tbody/td[1]"));
								System.out.println(wrngoldnew_pwdstatus.getText());
							   if(wrngoldnew_pwdstatus != null && wrngoldnew_pwdstatus.getText().matches("The old and new password should be different. ")){
								    	 System.out.println("Displayed wrong old and new password status as expected.");
								     }else{
								    	 System.out.println("Excepted : The old and new password should be different.");
								     }
							    	*/

								System.out.println("affiiateProfilePage functionality ends here....");

							
							}


						catch(Exception affiiateProfilePage)
						{
							affiiateProfilePage.printStackTrace();
								System.out.println(affiiateProfilePage);
						}


}

//if(wrngoldnew_pwdstatus != null && wrngoldnew_pwdstatus.getText().matches("The old and new password should be different."))
//fail("The old and new password is Incorrect.");

private void fail(String string) {
	// TODO Auto-generated method stub
	
}
private static WebElement findElementIfPresent(WebDriver driver, By xpath) {
	try {
        return driver.findElement(xpath);
    } catch (NoSuchElementException e)
    {
        return null;
    }
}
//-------------------------------------------------------------------------------------
														//TO TEST AFFILIATE WIDGET PAGE 
//@Test	    
@Test(enabled=false)
//@Test(dependsOnGroups="AffiliatePage")

			public static void affiiateWidgetPage()
				{

					try
						{
						 System.out.println("affiiateWidgetPage functionality starts here....");
						 IndexPage.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						 AffiliatePage.affiliateLogin();
						 IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[2]")).click();
						 IndexPage.driver.findElement(By.name("widgetname")).sendKeys("naveentest1");
						 IndexPage.driver.findElement(By.id("mySelect")).click();
						 WebElement element=IndexPage.driver.findElement(By.id("mySelect"));
						 Select se=new Select(element);
						 se.selectByValue("300X250");
						 IndexPage.driver.findElement(By.id("createwidget")).click();
						 String Widgetcreation_status = IndexPage.driver.findElement(By.xpath("//*[@id='pop']")).getText().toString();
						 System.out.println(Widgetcreation_status);
						 IndexPage.driver.findElement(By.className("ui-button-text")).click();
					//To Open a file from a desktop	system
						 File file = new File("C:/Users/NAVEEN/Documents/naveentest0.htm");
						 if(!Desktop.isDesktopSupported()){
					            System.out.println("Desktop is not supported");
					            return;
					        }
					         
					        Desktop desktop = Desktop.getDesktop();
					        if(file.exists()) desktop.open(file);
					         
					        /*//let's try to open PDF file
					        file = new File("/Users/pankaj/java.pdf");
					        if(file.exists()) desktop.open(file);*/
					        
					        IndexPage.driver.navigate().to("file:///C:/Users/NAVEEN/Documents/naveentest0.htm");
					        WebElement iframeElement = IndexPage.driver.findElement(By.id("iframe"));
					        IndexPage.driver.switchTo().frame(iframeElement);	
							IndexPage.driver.findElement(By.name("sourceIn")).sendKeys("Hyderabad");
							IndexPage.driver.findElement(By.name("destinationIn")).sendKeys("bangalore");
							IndexPage.driver.findElement(By.id("button")).click();
							IndexPage.driver.navigate().back();
							Thread.sleep(2000);
							IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[2]")).click();	
						 
					//Manage widgets functionality starts here
							
						    IndexPage.driver.findElement(By.xpath("//*[@id='tab-ct']/li[2]/div[1]/div[2]")).click();
						    IndexPage.driver.findElement(By.xpath("//*[@id='tab-ct']/li[2]/div[2]/div[2]/table/tbody/tr[5]/td[4]/a[1]")).click();
						    WebElement widgetName = IndexPage.driver.findElement(By.name("widgetname"));
						    widgetName.clear();
						    widgetName.sendKeys("Naveentest2");
						    //IndexPage.driver.findElement(By.name("widgetname")).sendKeys("Naveentest2");
						    IndexPage.driver.findElement(By.id("createwidget_update")).click();
						    String widgetUpdation_status = IndexPage.driver.findElement(By.xpath("//*[@id='pop']")).getText().toString();
							System.out.println(widgetUpdation_status);
							Thread.sleep(2000);
							IndexPage.driver.findElement(By.className("ui-button-text")).click();
							IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[2]")).click();
							IndexPage.driver.findElement(By.xpath("//*[@id='tab-ct']/li[2]/div[1]/div[2]")).click();
							IndexPage.driver.findElement(By.xpath("//*[@id='tab-ct']/li[2]/div[2]/div[2]/table/tbody/tr[4]/td[4]/a[2]")).click();
							String iframecode_status = IndexPage.driver.findElement(By.xpath("//*[@id='pop']")).getText().toString();
							System.out.println(iframecode_status);
							Thread.sleep(2000);
							IndexPage.driver.findElement(By.className("ui-button-text")).click();
							IndexPage.driver.findElement(By.xpath("//*[@id='tab-ct']/li[2]/div[2]/div[2]/table/tbody/tr[11]/td[4]/a[3]")).click();
							IndexPage.driver.findElement(By.className("smpButton-0")).click();
							IndexPage.driver.findElement(By.xpath("//*[@id='tab-hr']/li[3]")).click();
							IndexPage.driver.findElement(By.name("paymentFromDate")).click();
							IndexPage.driver.findElement(By.linkText("1")).click();
							IndexPage.driver.findElement(By.name("paymentToDate")).click();
							IndexPage.driver.findElement(By.linkText("15")).click();
						    IndexPage.driver.findElement(By.className(" pymtReport")).click();
						    String reportsAvailable_status = IndexPage.driver.findElement(By.xpath("//*[@id='paymentDetails']/div[2]")).getText().toString();
							Thread.sleep(2000);
							System.out.println(reportsAvailable_status);
						 
						    System.out.println("affiiateWidgetPage functionality ends here....");
						
						}

					catch(Exception affiiateWidgetPage)
					{
						affiiateWidgetPage.printStackTrace();
							System.out.println(affiiateWidgetPage);
					}


				}





 @AfterMethod
  public void afterMethod() throws IOException, InterruptedException
  {
	    File scr=((TakesScreenshot)IndexPage.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("D:\\error screenshots\\PassedResults\\Affiliatescreenshot_"+timestamp()+".png"));
		Thread.sleep(8000);
		IndexPage.driver.quit();
	  
	  
  }
             private String timestamp()
             {
	
            	 return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
               }

}
