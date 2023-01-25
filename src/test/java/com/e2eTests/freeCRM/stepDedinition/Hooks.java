package com.e2eTests.freeCRM.stepDedinition;

import com.cucumber.freeCRM.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{

	@Before
	public void runsBeforeAnyScenario() {

	}

	@After
	public void runsAfterAnyScenaruio() {
		driver.quit();
	}

}
