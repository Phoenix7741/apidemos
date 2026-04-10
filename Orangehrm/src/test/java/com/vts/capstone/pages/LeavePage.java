package com.vts.capstone.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeavePage {

    WebDriver driver;
    WebDriverWait wait;

    public LeavePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By leaveMenu = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']");
    By searchBtn = By.xpath("//button[normalize-space()='Search']");
    By fromDate = By.xpath("//div[@class='oxd-table-filter']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]");
    By toDate = By.xpath("//div[@class='oxd-table-filter']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]");
    By leaveStatus = By.xpath("//div[@class='oxd-multiselect-wrapper']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']");
    By leaveType = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By subUnit = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]");
    By includePastEmployees = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-leave-filter-text']");
    By resetBtn = By.xpath("//button[normalize-space()='Reset']");
    By tableHeaders = By.xpath("//div[@class='oxd-table-header']//div[@role='row']");

    public void openLeave() {
        driver.findElement(leaveMenu).click();
    }
    
    public boolean verifyLeavePageLoaded () {
    	return wait.until (ExpectedConditions.visibilityOfElementLocated(fromDate)).isDisplayed();
    }
    
    public boolean verifyAllFields() {
    return driver.findElement(fromDate).isDisplayed() && 
    	   driver.findElement(toDate).isDisplayed () && 
    	   driver.findElement(leaveStatus).isDisplayed () && 
    	   driver.findElement(leaveType).isDisplayed() && 
    	   driver.findElement(employeeName).isDisplayed () && 
    	   driver.findElement(subUnit).isDisplayed() && 
    	   driver.findElement(includePastEmployees).isDisplayed() && 
    	   driver.findElement(searchBtn).isDisplayed () && 
    	   driver.findElement(resetBtn).isDisplayed();
    }
    
    public boolean verifyDefaultDates() {
    	String from = driver.findElement(fromDate).getAttribute("value");
    	String to = driver.findElement(toDate).getAttribute("value");

    	return !from.isEmpty() && !to.isEmpty();
    }
    
    public boolean verifyPlaceholder () {
    		String placeholder = driver.findElement(employeeName).getAttribute("placeholder"); 
    		return placeholder.equals("Type for hints...");
    }
    
    public boolean verifyTableColumns() {

    	List<WebElement> headers = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(tableHeaders));

    	String[] expected = {
    	"Date", "Employee Name", "Leave Type", 
    	"Leave Balance", "Number of Days", "Status", 
    	"Comments", "Actions"
    	};

    	for (String exp : expected) {
    	    boolean found = headers.stream().anyMatch(e -> e.getText().equalsIgnoreCase(exp));
    	    if (!found) return false;
    	}
    	return true;
    }


    public void clickSearch() {
        driver.findElement(searchBtn).click();
    }

    public boolean isTableDisplayed() {
        return driver.getPageSource().contains("No Records Found");
    }
}
