import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Testedd {
	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 21, 14, 15, 13, 13);

		myList.parallelStream().collect(Collectors.collectingAndThen
				(Collectors.toCollection(ArrayList::new),
						adc -> {
							Collections.reverse(adc);
							return adc.stream();
						}
		
				)).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("---------000000000000000000000000000000000000000000000000000000000000----------------");
		
//		int result = myList.stream().max(Comparator.comparing(Integer::valueOf)).get();
//		.map(Map.Entry::getKey).collect(Collectors.toSet());
//		System.out.print(result);

	
	 myList.stream().collect
		(Collectors.groupingBy
				(Function.identity(), Collectors.counting()))
					.entrySet().stream().filter(m -> m.getValue()>1).map(Map.Entry::getKey)
					.collect(Collectors.toSet()).forEach(System.out::println);
		

		int sum = myList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

//		Optional<Integer> sum1 = myList.stream().reduce((a, b) -> a + b);

//		System.out.println(sum);

//		List<EmployeeData> empdata = new ArrayList<EmployeeData>();

		// dept

//		Map<String, List<EmployeeData>> data = empdata.stream()
//				.collect(Collectors.groupingBy(EmployeeData::getDepartment, LinkedHashMap :: new, Collectors.toList()));

		// total salary form on department

//		empdata.stream().collect(Collectors.summarizingLong(EmployeeData::getSalary));

		// departname , numbere of emp

//		empdata.stream().collect(Collectors.groupingBy(EmployeeData::getDepartment,
//				LinkedHashMap :: new , Collectors.counting()));
//
		HashMap<Integer, String> daataa = new HashMap<Integer, String>();

		daataa.put(1, "c");
		daataa.put(11, "d");
		daataa.put(21, "a");
		daataa.put(2, "b");

//		daataa.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

//	daataa.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::print);

////		Map<Integer, String> res = 
//				daataa.entrySet().stream().sorted((Map.Entry.comparingByValue())).forEach(System.out::print);	
//		

		String name = "PrashantRanjan";

//		char[] c = name.toCharArray();

//		Arrays.asList(c).stream()
//				.collect(Collectors.groupingBy(Function.identity(),
//						LinkedHashMap::new, Collectors.counting())).entrySet().forEach(System.out::println);
	}
}
