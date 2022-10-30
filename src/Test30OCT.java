import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test30OCT {

	public static void main(String[] args) {

		List<EmpTestEy> list = new ArrayList();
		list.add(new EmpTestEy("prashant", 101, 8999));
		list.add(new EmpTestEy("prashant2", 102, 999));
		list.add(new EmpTestEy("Rohitashant", 104, 6999));
		list.add(new EmpTestEy("Amant", 100, 18999));

		for (EmpTestEy empTestEy : list) {
			System.out.println(empTestEy.getEmpName() + " " + empTestEy.getEmpId() + " " + empTestEy.getSalary());
		}

		System.out.println("------------");

		Map<Integer, List<EmpTestEy>> data = list.stream()
				.sorted(Comparator.comparingInt(EmpTestEy::getSalary).reversed())
				.collect(Collectors.groupingBy(EmpTestEy::getSalary));
		
	for(Map.Entry<Integer, List<EmpTestEy>> empdd : data.entrySet()) {
		System.out.print(empdd.getKey()+"---- data ----");
		for (EmpTestEy empTestEy : empdd.getValue()) 
		{
			System.out.println(empTestEy.getEmpName()+" "+
			empTestEy.getEmpId());
		}
	}
		
		
//		.entrySet().stream().map(Map.Entry::getValue)
//				.collect(Collectors.toList()).forEach(System.out::print);
		
//		.entrySet().stream().map(Map.Entry::getValue));

//	   list.stream().collect
//	   (Collectors.groupingBy(EmpTestEy::getSalary)).entrySet().stream()
//	   .sorted();

//	   list.stream().sorted((e1,e2)->((e1.getSalary()).compareTo(e2.getSalary())>0)).collect(Collectors.toList());

//	   
//	   Select salary from employee  e1 where 3-1 = 
//	   (select   distict(salary) from emplyee e2 where e2.salary>e1.salary );
	}

}
