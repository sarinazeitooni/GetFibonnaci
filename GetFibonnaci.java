import java.util.Scanner;
public class GetFibonnaci {
	public static int fib(int n) {
		return n < 2 ? n : fib(n - 1) + fib(n - 2);
	}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
		for (int i = 0; fib(i) < number; i++) {
			System.out.println(fib(i));
		}
	}
}