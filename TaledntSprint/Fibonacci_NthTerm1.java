import java.util.Scanner;

public class Fibonacci_NthTerm1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nthTerm;
		nthTerm = scan.nextInt();

		System.out.println(getNthTermOfFibonacciSeries(nthTerm));
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) {

		if (nthTerm <= 0) {
			return (-1);
		}
		if (nthTerm == 1)
			return (0);
		if (nthTerm == 2)
			return (1);
		int first = 0;
		int second = 1;
		int next;

		for (int n = 2; n <= nthTerm - 1; n++) {

			next = first + second;
			first = second;
			second = next;

		}
		return second;

	}
}
