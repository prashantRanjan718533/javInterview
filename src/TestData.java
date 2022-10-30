public class TestData {

	public static void main(String[] args) {

//	Write a program to display those starting with A and having length of 3 characters in Java 8.
		String s[] = { "AB", "ABC", "BC", "BCD", "AAA", "BBB" };

		int a = 10;
		int n1=0, n2=1;
		int n3;
		System.out.print( n1+ " "+n2);
		for( int i=2; i<a; i++) {
			
			n3= n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			
			
		}
		
		

		
	}
}
