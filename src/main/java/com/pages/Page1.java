package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {

	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='custom-logo-link']")
	private WebElement clickproductpage;
	@FindBy(xpath="//a[@class='noo-search']")
	private WebElement SearchProduct;
	@FindBy(name="s")
	private WebElement SelectProduct;
	

	public Page1(WebDriver d) {
		this.driver= d;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getClickproductpage() {
		return clickproductpage;
	}
	public WebElement getSearchProduct() {
		return SearchProduct;
	}

	public WebElement getSelectProduct() {
		return SelectProduct;
	}

	

}
