package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before(order = 30)
	public void bef() {
		edgeBrowser();
		
	}
	
	@Before(order = 40)
	public void bef1() {
		maxWindow();
	}
	@Before(order = 25)
	public void bef2() {

		System.out.println("Take the Screeshot Before Execution");
	}

	@After(order = 5)
	public void aft() {

		System.out.println("Take the Screenshot After  Execution");
	}
	@After(order = 10)
	public void aft1() {

		closeBrowser();
	}
}
