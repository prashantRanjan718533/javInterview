package testNew;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Dup {

	public static void main(String[] args) {

		String data = "Prashhanttt";

		char[] val = data.toCharArray();

		HashMap<Character, Integer> hashMap = new HashMap();

		for (int i = 0; i < val.length; i++) {
			if (hashMap.containsKey(val[i])) {
				hashMap.put(val[i], hashMap.get(val[i]) + 1);

			} else {
				hashMap.put(val[i], 1);

			}
		}
		
		System.out.println(hashMap);

	}
	
	
}
