package testPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExcelDataExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", ".//lib/drivers/chromedriver.exe");		
	    //WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        
	        driver.get("https://signup.live.com/"); 
	        
	        driver.manage().window().maximize();
	        
	        FileInputStream infile = new FileInputStream(new File(".//data/testdata.xlsx")); 
	        
			XSSFWorkbook databook1=new XSSFWorkbook (infile);
	        XSSFSheet datasheet1 = databook1.getSheet("data");
	        
	        int datasetNum=1;	
	        int totalrows = datasheet1.getLastRowNum();	       
	        System.out.println("No. of test cases: "+totalrows);
	        
	        while(datasetNum<=totalrows)
	        {
	        	System.out.println("Running test case :: " + datasheet1.getRow(datasetNum).getCell(0).getStringCellValue());
	           
	           for(int i= 1; i<=11; i++ )
	           {
	        	   String CellValue = "";            
	        	   String colname = datasheet1.getRow(0).getCell(i).getStringCellValue();
	        	   try
	        	   {
	        		   CellValue = datasheet1.getRow(datasetNum).getCell(i).getStringCellValue();
	        	   }
	        	   catch(Exception ex)
	        	   {
	        		   
	        	   }
	               switch(colname.toLowerCase())
	               {
		               case "first_name":
		            	   driver.findElement(By.id("FirstName")).sendKeys(CellValue);
		               break;
		               
		               case "last_name":
		            	   driver.findElement(By.id("LastName")).sendKeys(CellValue);
		               break;
		               
		               case "user_name":
		            	   driver.findElement(By.id("MemberName")).sendKeys(CellValue);
		               break;
		               
		               case "password":
		            	   
		            	   
		            	   
		            	   //WebDriverWait waiter = new WebDriverWait(driver, 40);
		            	   //waiter.until(ExpectedConditions.elementToBeClickable(By.id("Password")));
		            	   
		            	   driver.findElement(By.id("Password")).click();
		            	   driver.findElement(By.id("Password")).sendKeys(CellValue);	
		            	   
		            	   
		            	   
		            	   //WebDriverWait waiter1 = new WebDriverWait(driver, 40);
		            	   //waiter1.until(ExpectedConditions.elementToBeClickable(By.id("RetypePassword")));
		            	   
		            	   driver.findElement(By.id("RetypePassword")).click();
		            	   driver.findElement(By.id("RetypePassword")).sendKeys(CellValue);
		               break;
		               
		               case "country_region":
		            	   Select Country = new Select(driver.findElement(By.id("Country")));		            	   
		            	   Country.selectByVisibleText(CellValue);
		               break;
		               
		               case "dob_month":
		            	   Select BirthMonth = new Select(driver.findElement(By.id("BirthMonth")));		            	   
		            	   BirthMonth.selectByVisibleText(CellValue);
		               break;
		               
		               case "dob_day":
		            	   Select BirthDay = new Select(driver.findElement(By.id("BirthDay")));		            	   
		            	   BirthDay.selectByIndex((int) datasheet1.getRow(datasetNum).getCell(i).getNumericCellValue());
		               break;
		               
		               case "dob_year":
		            	   Select BirthYear = new Select(driver.findElement(By.id("BirthYear")));		            	   
		            	   BirthYear.selectByValue(CellValue);
		               break;
		               
		               case "gender":
		            	   Select Gender = new Select(driver.findElement(By.id("Gender")));		            	   
		            	   Gender.selectByVisibleText((CellValue));
		               break;
		               
		               case "country_code":
		            	   Select PhoneCountry = new Select(driver.findElement(By.id("PhoneCountry")));		            	   
		            	   PhoneCountry.selectByValue((CellValue));
		               break;
		               
		               case "phonenumber":
		            	   driver.findElement(By.id("PhoneNumber")).sendKeys(CellValue);
		               break;	               
	               }
	               
	            }  
	           //Click Submit button
               
               driver.findElement(By.xpath("//input[@aria-label='Enter the characters you see']")).sendKeys("ABCDF");
               
               driver.findElement(By.id("CredentialsAction")).click();
               
               String errorMsg = driver.findElement(By.xpath("//div[contains(@id,'wlspispHIPErrorWrong')]")).getText();
               
               if(errorMsg.contains("The characters didn't match the picture. Please try again."))
               {
            	   FileOutputStream outFile1 =new FileOutputStream(new File(".//data/Testdata.xlsx")); 

            	   //writing error message to spreadsheet
      	           datasheet1.getRow(datasetNum).getCell(12).setCellValue(errorMsg);
	               
	               databook1.write(outFile1);
       	   		   outFile1.close(); 
       	   		   
       	   		System.out.println("Test Result :: " + errorMsg);
               }
                 
	           datasetNum++;
	           
	           driver.navigate().refresh();
	         }
	        
	        infile.close();
	        driver.close();
	}

}
