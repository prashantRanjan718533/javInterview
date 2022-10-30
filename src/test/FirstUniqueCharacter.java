package test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String data = "asasbc";
		extracted(data);

	}

	/**
	 * @param data
	 */
	private static int extracted(String data) {
		HashMap<Character,Integer> hashMap = new LinkedHashMap<>();
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
		}

		for (int j = 0; j < data.length(); j++) {
			if (hashMap.get(data.charAt(j)) == 1) {
				System.out.println(data.charAt(j));
				break;
			}
		}
		return -1;
	}
}
