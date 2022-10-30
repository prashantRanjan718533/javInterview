package java8;

import java.util.HashSet;
import java.util.Set;

public class RemoveduplFromArray {

	public static void main(String[] args) {

		String arr[] = { "bb","zz", "10", "a1a","10","zz", "abc", "a1a",  "ab4c" };
		int count = 0;

//		for (int i = 0; i < arr.length; i++) {
////			count = 0;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i].equals(arr[j])) {
//					System.out.println(arr[i]);
//					count++;
//				}
//			}
//		}

		Set<String> dup = new HashSet<>();
		for (String string : arr) {

			if (dup.contains(string)) {
				System.out.println(string);

			} else
				dup.add(string);

		}

		System.out.println(dup);

	}

}
