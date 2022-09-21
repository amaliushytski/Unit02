package it.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double b = 12.5;
		double a = 2.1;
		double c = 15.1;

		double exp = ((b + Math.sqrt((Math.pow(b, 2) + (4 * a * c))) / (2 * a)) - (Math.pow(a, 3)) * c) + b;
		System.out.println(exp);
	}

}
