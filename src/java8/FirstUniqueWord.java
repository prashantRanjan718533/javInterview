package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstUniqueWord {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] arr = { "Wolf", "apple" , "apple", "aolf", "Lion", "b0lf"};
		Map<String, Integer> mapcount = new HashMap<>();

		for (String string : arr) {
			
			if(mapcount.containsKey(string)) {
				mapcount.put(string, mapcount.get(string)+1);
				
			}
			else {
				mapcount.put(string, 1);
			}
		}
		
		
//		mapcount = Arrays.stream(arr).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

		
		System.out.println(mapcount);
		
		for (String s : arr) {
			if (mapcount.get(s) == 1) {
				System.out.println("the first duplicate is : " + " " + s);
			}
		}
		
		

	}

}
