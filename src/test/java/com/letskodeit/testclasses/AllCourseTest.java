package com.letskodeit.testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class AllCourseTest {

     WebDriver driver;
     String baseURL;

     @BeforeClass
        public void setUp() {

         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         baseURL = "http://https://learn.letskodeit.com/";
         driver.get(baseURL);

     }

     public void verifySearchCourse(){

         //open();
        // signInWith("test@gmail.com",'abcabc');
         //searchCourse("rest api");
         //boolean searchResult = verifySearchCourse();

     }

         public void teardown(){
         driver.quit();
         }






}
