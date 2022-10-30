package java8;

@FunctionalInterface
 interface Intftest{
	
	public void m1(int a , int b);
}

public class FunctionalnterfaceTest {
	public static void main(String[] args) {
		
		Intftest i = (a,b)->System.out.println("tested success " +( a+b));
		i.m1(10, 11);
		
	}

}
