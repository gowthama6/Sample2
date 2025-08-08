package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass11;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Ansignin extends BaseClass11 {
	AnsiginPojo a;

	@When("launch the url of amazon page")
	public void launch_the_url_of_amazon_page() {
		launchUrl(
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=17000861721100273740&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
		a = new AnsiginPojo();
		clickBtn(a.getSignin());
	}

	@When("To pass the email or mobileno in textbox field")
	public void to_pass_the_email_or_mobileno_in_textbox_field(DataTable d) {
		a = new AnsiginPojo();
		List<Map<String, String>> m = d.asMaps();
		passText(m.get(1).get("email"), a.getEmail());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() throws InterruptedException {
		Thread.sleep(3000);
		a = new AnsiginPojo();
		clickBtn(a.getContinuebutton());
	}

	@When("To pass the password in textbox field")
	public void to_pass_the_password_in_textbox_field(DataTable d) {
		a = new AnsiginPojo();
		Map<String, String> m = d.asMap(String.class, String.class);
		passText(m.get("password2"), a.getPassword());
	}

}