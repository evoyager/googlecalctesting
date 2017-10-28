package googlecalc.selenium.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import googlecalc.selenium.page.google.goLanding;

public class googleSteps extends ScenarioSteps {

	goLanding landingPage;

	public googleSteps(Pages pages) {super(pages);}

	@Step
	public googleSteps open_landing_page(){
		landingPage.open();
		return this;
	}

	@Step
	public googleSteps search_for_keyword(String keyword){
		landingPage.search(keyword.toLowerCase());
		return this;
	}

//	@Step
//	public googleSteps find_in_results(String keyword){
//		landingPage.findUrl(keyword);
//		return this;
//	}

	@Step
	public googleSteps get_result(String keyword){
		assert landingPage.getResult(keyword);
		return this;
	}

}
