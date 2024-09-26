package DefaultMethod;

public class Driver1 {

	public static void main(String[] args) {
		WebDriver1 wd = new ChromeDriver1();
		TakeScreenshot1 ts = (TakeScreenshot1)wd;
		ts.getScreenshot();
		ChromeDriver1 cd = (ChromeDriver1)wd;
		cd.drive();

	}

}
