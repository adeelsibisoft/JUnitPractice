
public class TestCaseTest extends TestCase {

	TestCaseTest(String methodName){
		super(methodName);
	}
	public void testRunning(){
		WasRun test = new WasRun("testMethod");
		test.run(new TestResult());
	}
	
	public void testTemplateMethod(){
		WasRun test = new WasRun("testMethod");
		
		//System.out.println(test.log.equals("setUp testMethod tearDown ") );
		TestResult result = test.run(new TestResult());
		System.out.println(result.summary().equals("1 run, 0 failed"));
	}
	
	public void testFailedResult(){
		WasRun test = new WasRun("testBrokenMethod");
		TestResult result= test.run(new TestResult());
		System.out.println(result.summary().equals("1 run, 1 failed"));
	}
	
	public void  testFailedResultFormatting(){
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		System.out.println(result.summary().equals("1 run, 1 failed"));
	}

	public static void mainB4Suites(String [] args){
		//System.out.println("TestCaseTest has started");

		TestCaseTest testCaseForTestRunning = new TestCaseTest("testTemplateMethod");
		testCaseForTestRunning.run(new TestResult());
		
		
		TestCaseTest testFailedResult = new TestCaseTest("testFailedResult");
		testFailedResult.run(new TestResult());
		
		TestCaseTest testFailedResultFormatting = new TestCaseTest("testFailedResultFormatting");
		testFailedResultFormatting.run(new TestResult());
		
	}
	public void testSuite(){
		TestSuite suite= new TestSuite();
		suite.add(new TestCaseTest("testMethod"));
		suite.add(new TestCaseTest("testBrokenMethod"));
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println( result.summary().equals("2 run, 1 failed"));
	}
	public static void main(String [] args){
		TestSuite suite= new TestSuite();
		suite.add(new TestCaseTest("testTemplateMethod"));
		//suite.add(new TestCaseTest("testResult"));
		//suite.add(new TestCaseTest("testFailedResultFormatting"));
		//suite.add(new TestCaseTest("testFailedResult"));
		//suite.add(new TestCaseTest("testSuite"));
		TestResult result= new TestResult();
		suite.run(result);
		System.out.println( result.summary());
	}
}
