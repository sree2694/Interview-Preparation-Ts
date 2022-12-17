import java.util.Scanner;

public class RoundedSum {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter three numbers:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		sumOfRoundedValues(a, b, c);
		System.out.println(sumOfRoundedValues(a, b, c));

	}

	public static int sumOfRoundedValues(int n1, int n2, int n3) {

		int a = checkRound(n1);
		int b = checkRound(n2);
		int c = checkRound(n3);
		return a + b + c;

	}

	@SuppressWarnings("unused")
	public static int checkRound(int n) {
		int a = n % 10, b = n % 10, c = n % 10;
		if ((a >= 5) && (b >= 5) && (c >= 5) && (a <= 10) && (b <= 10) && (c <= 10)) {
			if (a == 5 && b == 5 && c == 5) {
				n = n + 5;
			} else if (a == 6 && b == 6 && c == 6) {
				n = n + 4;
			} else if (a == 7 && b == 7 && c == 7) {
				n = n + 3;
			} else if (a == 8 && b == 8 && c == 8) {
				n = n + 2;
			} else if (a == 9 && b == 9 && c == 9) {
				n = n + 1;
			}

			return n;
		} else {

			if ((n / 10) != 0) {
				if (a == 1 && b == 1 && c == 1) {
					n = n - 1;
				} else if (a == 2 && b == 2 && c == 2) {
					n = n - 2;
				} else if (a == 3 && b == 3 && c == 3) {
					n = n - 3;
				} else if (a == 4 && b == 4 && c == 4) {
					n = n - 4;
				}
				return n;
			}

			return (-1);
		}
	}
}