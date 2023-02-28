package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup{
	private RetailHomePage homePage;
	private SignInPage signInPage;
	private RetailAccountPage accountPage;
	
	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signInPage = new SignInPage();
		this.accountPage = new RetailAccountPage();
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	public SignInPage signInPage() {
		return this.signInPage;
	}
	
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}

}
