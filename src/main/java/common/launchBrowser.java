package common;

public class launchBrowser extends net.serenitybdd.core.pages.PageObject {
	String baseURL;
	public void launchSiteURL(String url) throws InterruptedException {
		
		baseURL = url;
		getDriver().get(baseURL);
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
	}
}
