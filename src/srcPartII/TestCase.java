import java.lang.reflect.Method;


public class TestCase {
	String name;
	
	private Class noparams[] = {};
	
	
	TestCase(){}
	TestCase(String name){
		this.name = name;
	}
	public TestResult run( TestResult testResult ) {
		testResult.testStarted();
		try {
			setUp();
			Method method2 = this.getClass().getDeclaredMethod(name, noparams );
			method2.invoke(this);
			tearDown();
		} catch (Exception e) {
			testResult.testFailed();
		}
		return testResult;
	}
	
	public void setUp(){
	}
	public void tearDown(){
		
	}
}
