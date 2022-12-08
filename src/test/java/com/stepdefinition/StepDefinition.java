package com.stepdefinition;

import com.base.BaseClass;
import com.pages.Page1;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass{

	Page1 p1=new Page1 (driver);
	
@Given("user launch the url")
public void user_launch_the_url() {
	BrowserLaunch("chrome");
   urlLaunch("https://shop.demoqa.com/cart/");
   maximize();
   implicitlyWait(10);
   
}

@When("user click to go for the products page")
public void user_click_to_go_for_the_products_page() {
	//WebElement findElement = driver.findElement(By.xpath("//a[@class='custom-logo-link']"));
	//findElement.click();
	Click(p1.getClickproductpage());
   
}

@When("user search for the particular product")
public void user_search_for_the_particular_product() {
   sendKeys(p1.getSearchProduct(),"black");
   
}

@Then("user select the product")
public void user_select_the_product() {
   
}

@Given("user chose the product color")
public void user_chose_the_product_color() {
   
}

@Given("user chose the product size")
public void user_chose_the_product_size() {
   
}

@Given("click the add to card button")
public void click_the_add_to_card_button() {
   
}

@Then("user click the view cart button")
public void user_click_the_view_cart_button() {
   
}

@Given("user click the checkout button")
public void user_click_the_checkout_button() {
   
}

@Given("user fill the firstname lastname and companyname")
public void user_fill_the_firstname_lastname_and_companyname() {
   
}

@Given("user fill the address and town")
public void user_fill_the_address_and_town() {
   
}

@Given("user select the state")
public void user_select_the_state() {
   
}

@Given("user enter the pincode and phone number")
public void user_enter_the_pincode_and_phone_number() {
   
}

@Given("user enter the e-mail id")
public void user_enter_the_e_mail_id() {
   
}

@Then("user click the place order button")
public void user_click_the_place_order_button() {
    
}

	

}
