package org.stepdefinition;

import org.base.BaseClass11;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass11 {
	@Before
	public void precondition() {
		launchBrowser();
		windowMaximize();
	}

	@After
	public void postcondition() {
		closeEntireBrowser();
	}
}
