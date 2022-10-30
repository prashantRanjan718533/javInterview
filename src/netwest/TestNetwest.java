package netwest;

import java.util.HashMap;

public class TestNetwest {

	public static void main(String[] args) {

		String data = "This This is is done by prashant";

		String[] dup = data.split(" ");

		HashMap<String, Integer> hashMap = new HashMap<>();

		for (int i = 0; i<dup.length; i++) {

			if (hashMap.containsKey(dup[i])) {
				hashMap.put(dup[i], hashMap.get(dup[i]) + 1);
			} else {
				hashMap.put(dup[i], 1);
			}

		}
		
		System.out.println(hashMap);
	}

}
