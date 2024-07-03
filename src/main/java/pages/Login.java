package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Login  extends PageObject {
   
	@FindBy(xpath = "//*[@name='q']")
	public WebElementFacade userName;
	
}
