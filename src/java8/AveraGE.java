package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public  class AveraGE
{
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(1);
		list.add(12);
		list.add(9);
		list.add(16);
		
		//100
	Double data  =  list.stream().map( i -> i*i).filter(a -> a>100).
	 collect(Collectors.averagingInt(Integer::intValue));
	
	System.out.println(data);
		
	OptionalDouble datata = list.stream().mapToDouble( i -> i*i).filter(a -> a>100).average();

	System.out.println(datata);
		

	}

}
