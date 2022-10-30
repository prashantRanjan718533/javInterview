package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {
	public static void main(String[] args) {

		String s = "rahukkh";

		String[] arr = { "rahul", "raunak", "rashant", "rohit", "surbhi" };
		Stream<String> str = Stream.of(arr);
		str.filter(a ->

		(a.startsWith("r") && a.length() >= 6)

		).collect(Collectors.toList()).forEach(System.out::println);

		s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(a -> a.getValue() > 1).collect(Collectors.toSet())
				.forEach(System.out::println);

//		Set<Integer> result = data.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // create
////				 7=1,
//																																// 9=2}
//						.entrySet().stream() // Map -> Stream
//						.filter(m -> m.getValue() > 1) // if map value > 1, duplicate element
//						.map(Map.Entry::getKey).collect(Collectors.toSet());
//				System.out.print(result);

//		Map<Character, Long> d = s.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
//
//		d.entrySet().stream().filter(a -> a.getValue() > 1).collect(Collectors.toSet()).forEach(System.out::println);

//		.entrySet().forEach(System.out::println);

	}
}
