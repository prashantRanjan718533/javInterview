package java8;

public class SingeltonTest {
	
	private static SingeltonTest singeltonTest = new SingeltonTest();
	
	private SingeltonTest () {
		
		
	}
	

	public static SingeltonTest getSingeltonInstance() {
		 return singeltonTest;
	}

}
