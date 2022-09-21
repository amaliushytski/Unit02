package it.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		double x;
		double fx;

		x = 4.0;

		if (x <= 3) {
			fx = 9;
		} else {
			fx = 1 / ((x * x) + 1);
		}
		System.out.println(fx);
	}

}
