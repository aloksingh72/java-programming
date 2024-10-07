package DefaultMethod;

public class RemoteWebDriver1 implements WebDriver1,JavaScriptExecuter1,TakeScreenshot1{
	
	
	public void test() {
		System.out.println("test method of remote web driver");
	}
	public void findElement() {
		System.out.println("Find Element is implemented");
	}
	public void get() {
		System.out.println("get is implemented");
	}
	public void executeScript() {
		System.out.println("Execute Scipt is implemented");
		
	}
	public void getScreenshot() {
		System.out.println("get Screenshot is implemented");
	}

}
