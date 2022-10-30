package java8;

public class PalindromJava {
	public static void main(String[] args) {
		String s = "Radaar";
		findPalindrom(s);
	}

	public static void findPalindrom(String ss) {

		char[] c = ss.toCharArray();
		String palindrom = "";
		for (int i = c.length - 1; i >= 0; i--) {
			palindrom += c[i];
		}
		if (ss.equalsIgnoreCase(palindrom)) {
			System.out.println("yes");
		} else {
			System.out.println("NO");
		}

	}

}
