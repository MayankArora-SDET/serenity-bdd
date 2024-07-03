package common;

import net.serenitybdd.core.pages.PageObject;

public class launchBrowser extends PageObject {
	String baseURL;
	public void launchSiteURL(String url) throws InterruptedException {
		
		baseURL = url;
		getDriver().get(baseURL);
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
	}
}
