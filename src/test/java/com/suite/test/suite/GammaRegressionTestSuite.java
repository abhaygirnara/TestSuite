package com.suite.test.suite;

import com.suite.test.FirstTest;
import com.suite.test.SecondTest;
import com.suite.test.group.ShippingServiceTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by abhay.girnara on 09/10/15.
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(ShippingServiceTests.class)
@Suite.SuiteClasses({ FirstTest.class, SecondTest.class })
public class GammaRegressionTestSuite {
}
