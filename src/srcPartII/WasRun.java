import java.lang.reflect.Method;


public class WasRun extends TestCase {

	public boolean wasRun;
	public boolean wasSetUp;
	public String log;
	
	public WasRun() {
		super();
	}
	public WasRun(String methoddName) {
		super(methoddName);
	}

	public void testMethod() {
		wasRun = true;
		log = log + "testMethod ";
	}
	
	public void setUp(){
		wasRun = false;//??
		wasSetUp = true;
		log = "setUp ";
	}
	public void tearDown(){
		log = log + "tearDown ";
	}
		


}
