package zoho.managers;

import zoho.pages.*;

public class PageObjectManager {

	TopMenuComponent topMenu;


	CnaHomePage cnaHomePage;
	CnaNewsItemPage cnaNewsItemPage;
	CnaInternationalPage cnaInternationalPage;

	WebDriverManager app;
	
	public PageObjectManager() {
		this.app = new WebDriverManager();
	}
	
	
	public WebDriverManager getWebDriverManager() {
		return app;
	}

	public CnaHomePage getCnaHomePage() {
		if(cnaHomePage == null)
			cnaHomePage = new CnaHomePage(app);
		return cnaHomePage;
	}

	public CnaInternationalPage getCnaInternationalPage() {
		if(cnaInternationalPage == null)
			cnaInternationalPage = new CnaInternationalPage(app);
		return cnaInternationalPage;
	}

	public CnaNewsItemPage getCnaNewsItemPage() {
		if(cnaNewsItemPage == null)
			cnaNewsItemPage = new CnaNewsItemPage(app);
		return cnaNewsItemPage;
	}


	public TopMenuComponent getTopMenu() {
		if(topMenu == null)
			topMenu = new TopMenuComponent(app);

		return topMenu;
	}

}

