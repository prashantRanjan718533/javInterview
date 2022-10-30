import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test211 {

	public static void main(String[] args) {

		String data = "This This is done by prashant";

		String[] arg = data.split(" ");

		HashMap<String, Integer> hashMap = new LinkedHashMap<>();

		for (int i = 0; i < arg.length; i++) {
			

			if (hashMap.containsKey(arg[i])) {
				hashMap.put(arg[i], hashMap.get(arg[i]) + 1);
			} else {
				hashMap.put(arg[i], 1);
			}

		}
		System.out.println(hashMap);
		
		for(Map.Entry<String , Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}
