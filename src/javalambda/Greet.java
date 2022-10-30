package javalambda;

class Greet {

	public static void main(String[] args) {

		int i = 5;

		Square g = (a) -> a * a;

		int ans = g.testGreeting(i);
		System.out.println(ans);
	}

}
