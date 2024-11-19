package org.testing.TestCases;

import org.testing.Base.BaseClassOne;
import org.testing.TestScript.LoginPageOne;
import org.testng.annotations.Test;

public class TC1 extends BaseClassOne {
@Test
public void LoginSauceDemo() {
LoginPageOne lg=new LoginPageOne(driver, pr);
lg.loginPage("standard_user", "secret_sauce");
}

}
