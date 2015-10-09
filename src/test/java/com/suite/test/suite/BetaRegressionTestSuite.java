package com.suite.test.suite;

import com.suite.test.group.ShippingServiceTests;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.suite.test.FirstTest;
import com.suite.test.SecondTest;

@RunWith(Categories.class)
@IncludeCategory(ShippingServiceTests.class)
@SuiteClasses({ FirstTest.class, SecondTest.class })
public class BetaRegressionTestSuite {

}
