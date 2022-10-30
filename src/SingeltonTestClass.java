
public class SingeltonTestClass {

	private static SingeltonTestClass singeltonTestClass = null;

	private SingeltonTestClass() {
		if (singeltonTestClass != null) {
 
			new SingeltonTestClass();
			
		}
	}

	public static SingeltonTestClass getInstance() {
		return singeltonTestClass;
	}
}
