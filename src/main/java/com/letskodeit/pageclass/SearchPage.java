package com.letskodeit.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public SearchPage(WebDriver driver){

        this.driver = driver;
    }
    public WebDriver driver;

    private String SEARCH_COURSE_FIELD = "search-courses";
    private String SEARCH_COURSE_BUTTON = "search-course-button";

    public void course(String courseName){

        WebElement searchElement = driver.findElement(By.xpath(SEARCH_COURSE_FIELD));
        searchElement.clear();
        searchElement.sendKeys(courseName);

        WebElement searchButton = driver.findElement(By.xpath(SEARCH_COURSE_BUTTON));

        searchButton.click();
    }

}
