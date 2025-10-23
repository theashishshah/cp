import java.util.Scanner;

public class ArrayColoring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases
		while (t-- > 0) {
			int n = scanner.nextInt(); // Length of the array
			int[] a = new int[n]; // Array to store the elements
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt(); // Input the elements of the array
			}

			int countOfOdd = 0; // Variable to count the number of odd elements
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 1) { // Check if the element is odd
					countOfOdd++; // Increment the count if the element is odd
				}
			}

			// Check if the count of odd numbers is odd
			if (countOfOdd % 2 == 1) {
				System.out.println("NO"); // If odd, output "NO"
			} else {
				System.out.println("YES"); // If even, output "YES"
			}
		}
		scanner.close();
	}
}

/*
Time Complexity (TC): O(n) = O(50)
Space Complexity (SC): O(n) = O(50)
*/