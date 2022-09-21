package it.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		int a = -5;
		int b = 4;
		double c = 7.7;

		if (a >= 0) {
			double a2 = a;
			a2 = Math.pow(a2, 2);
			System.out.println(a2);
		} else {
			double a2 = a;
			a2 = Math.pow(a2, 4);
			System.out.println(a2);
		}
		if (b >= 0) {
			double b2 = b;
			b2 = Math.pow(b2, 2);
			System.out.println(b2);
		} else {
			double b2 = b;
			b2 = Math.pow(b2, 4);
			System.out.println(b2);
		}
		if (c >= 0) {
			c = Math.pow(c, 2);
			System.out.println(c);
		} else {
			c = Math.pow(c, 4);
			System.out.println(c);

		}
	}
}
