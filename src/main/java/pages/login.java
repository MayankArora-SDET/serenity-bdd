package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class login  extends PageObject {
	@FindBy(xpath = "//*[@name='q']")
	public WebElementFacade userName;
	
	
	
}
