package testSteamLambada;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambadaStream {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(19);
		arrayList.add(30);
		arrayList.add(12);
		arrayList.add(24);
		arrayList.add(11);
		arrayList.add(18);
		
		arrayList.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println);
		
		//or 
		List<Integer> data = arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(data);
		
		//add 5 to all the elements
		
		List<Integer>  mapdata =  arrayList.stream().map(j -> j+5).collect(Collectors.toList());
		
		
	
		System.out.println(mapdata);
	}

}
