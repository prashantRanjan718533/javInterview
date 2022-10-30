package testSteamLambada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparator<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	// age compartaor
//	public int compare(Student o1, Student o2) {
//		if (o1.rollno > o2.rollno) {
//			return 1;
//		} else if (o1.rollno < o2.rollno) {
//			return -1;
//		} else {
//			return 0;
//		}
//
//	}

	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class ComparbleSOrting {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println(al);

		Collections.sort(al, new Student(0, null, 0));
//
		System.out.println(al);
	}

}
