package com.devops.calc;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    public static void main(String[] args) {
		System.out.println("************** Calculator Program **********");
		System.out.println("********************************************");
		System.out.println();
		System.out.println("ADDITION       : 2020 + 3030 = " + add(2020, 3030));
		System.out.println("SUBTRACTION    : 7000 - 4000 = " + subtract(7000, 4000));
		System.out.println("MULTIPLICATION : 1200 * 6    = " + multiply(1200, 6));
		System.out.println("DIVISION       : 7890 / 2    = " + divide(7890, 2));
		System.out.println();
		System.out.println("********************************************");
		System.out.println("********************************************");
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static double divide(int a, int b) {
		double result;
		if (b == 0) {
				throw new IllegalArgumentException("Divisor cannot divide by 0");
		} else {
			result = Double.valueOf(a) / Double.valueOf(b);
		}
		return result;
	}
}
