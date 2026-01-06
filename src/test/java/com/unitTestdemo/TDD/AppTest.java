package com.unitTestdemo.TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void testPassword() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.isValid("");
        Assert.assertEquals(true, result);
    }

}
