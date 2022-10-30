package java8;

import java.util.HashMap;

public class JavaCoding20 {
	
	public static void main(String[] args) {
		
		String data = "123 645 789";
		String [] revedaata = data.split(" ");
		String ans = "";
		for(int i=revedaata.length-1 ; i>=0; i--) {
			 ans += revedaata[i]+"";
		 
		}
		
		System.out.println(ans);
		
	 
		String dup = " 0ne two one. one Two one Three ";
		String [] datamap = dup.trim().toLowerCase().split(" ");
//		 System.out.println(datamap.length);
		
		for (String string : datamap) {
			
			
		}
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		for (String string : datamap) {
			if(hashMap.containsKey(string)) {
				
			}
		}
				
		
		
	}

}
