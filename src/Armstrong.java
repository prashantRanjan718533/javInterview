
public class Armstrong {
	public static void main(String[] args) {
		int number = 153 , originalNumber, reminder, result = 0;
		originalNumber = number;
		while (originalNumber != 0) {
			reminder = originalNumber % 10; // 1, 5, 3
			result += reminder*reminder*reminder; // 1, 125,9
			originalNumber = originalNumber / 10; // 35, 3,0
		}
		if (result == number) {
			System.out.println("sucess");
		}
		else {
			System.out.println("falsejje");
		}
	}
}
