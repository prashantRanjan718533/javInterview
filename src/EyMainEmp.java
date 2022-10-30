import java.util.HashMap;
import java.util.Map;

public class EyMainEmp {

	public static void main(String[] args) {

		
		
		String s = "test";
		
		char [] c = s.toCharArray();
		 HashMap<Character , Integer> hashMap= new HashMap<Character, Integer>();

		 for( int i=0; i<c.length; i++) {
			 if(hashMap.containsKey(c[i])) {
				 hashMap.put(c[i], hashMap.get(c[i])+1);
			 }
			 else {
				hashMap.put(c[i], 1);
			}
		 }
		 
		 for(Map.Entry<Character, Integer> map : hashMap.entrySet()) {
			 
			 if(map.getValue()==2) {
				 System.out.println(map.getKey());
			 }
			 
		 }
		 
		 
		 
		
	}

}
