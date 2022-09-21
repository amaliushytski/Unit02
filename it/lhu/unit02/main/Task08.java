package it.lhu.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		double a;
		double h;
		double x;
		double fx;
		System.out.println("Argument -> Value");
		for (a = 0; a < 10; ++a) {
			h = 1;
			x = a + h;
			fx = 2 * (Math.tan(x / 2)) + 1;

			System.out.println(x + "   " + fx);
			System.out.println(" ");

		}
	}
}
