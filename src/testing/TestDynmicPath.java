package testing;

public class TestDynmicPath {

	public static void main(String[] args) {
		
		//System.out.println(System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");
		
		test1("Firefox");
	}
	
	public static void test1(String name)
	{
		switch(name)
		{
		case "Chrome":
			System.out.println("Chrome is learning Automation");
			break;
		case "Firefox":
			System.out.println("Firefox is learning Automation");
			break;
		
		}
		
	}

}
