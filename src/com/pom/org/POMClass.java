package com.pom.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMClass {
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement name;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	

	}

	

