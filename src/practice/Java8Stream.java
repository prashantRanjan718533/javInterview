package practice;

//Java Program to Print the Inverted Right Triangle Star Pattern
import java.util.*;

public class Java8Stream {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 4, 10, 12, 87, 33, 75);

		int a = numbers.stream().reduce(0,Integer::sum);
		System.out.println(a);
		
		
	}

}
