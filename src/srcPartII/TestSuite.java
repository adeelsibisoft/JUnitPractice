import java.util.ArrayList;


public class TestSuite {
	ArrayList<TestCaseTest> tests = new ArrayList<TestCaseTest>();
	public void add( TestCaseTest test ){
		tests.add(test);
	}
	public void run(TestResult testResult) {
		for(TestCaseTest test : tests){
			test.run(testResult);
		}
	}
		
}
