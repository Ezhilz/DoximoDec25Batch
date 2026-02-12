package org.doximo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Asser2 {
	@Test(groups="smoke")
	private void tc1() {
		Assert.assertTrue(false);
	System.out.println("Test case 1");
	}
	
	@Test(dependsOnGroups= "smoke",alwaysRun=true)
	private void tc2() {
	System.out.println("Test case 2");
	
	}
	@Test(groups="smoke")
	private void tc3() {
	System.out.println("Test case 3");
	}
}
