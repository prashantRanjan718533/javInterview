package practice;

import java.util.Random;

public class PasswordGenration {

	public static void main(String[] args) {
		

		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String number = "1234567890";
		String symbols = "!";

		String value = Capital_chars + Small_chars + number + symbols;
		int length = 10;
		Random randomval = new Random();
		char[] password = new char[length];

		for (int i = 0; i < length; i++) {
			password[i]= value.charAt(randomval.nextInt(value.length()));
		}
		System.out.println(password);
	}
	
	

}
