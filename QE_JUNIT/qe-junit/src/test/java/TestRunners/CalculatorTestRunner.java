package TestRunners;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ demos.TestCalculator.class })
public class CalculatorTestRunner {
}