package com.qa.BlackjackExample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BustClass.class, NormalTest.class})
public class AllTests {

}
