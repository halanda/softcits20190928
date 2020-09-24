import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day2_Operators {

    // Complete the solve function below.
	static void solve(double meal_cost, int tip_percent, int tax_percent) {

		double b = meal_cost * tip_percent / 100;
		double c = meal_cost * tax_percent / 100;
		double a = meal_cost + b + c;
		/*
		 * System.out.println("向上取整:" + (int) Math.ceil(96.1));// 97 (去掉小数凑整)
		 * System.out.println("向下取整" + (int) Math.floor(96.8));// 96 (去掉小数凑整)
		 * System.out.println("四舍五入取整:" + Math.round(96.1));// 96
		 * System.out.println("四舍五入取整:" + Math.round(96.8));// 97
		 */
		System.out.println(Math.round(a));

	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
