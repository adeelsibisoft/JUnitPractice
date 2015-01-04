
public class TestResult {
	int runCount;
	int errorCount;
	TestResult(){
		
	}
	public String summary(){
		return runCount+" run, "+errorCount+" failed";
	}
	public void testStarted() {
		runCount++;
		
	}
	public void testFailed() {
		errorCount++;
	}
}
