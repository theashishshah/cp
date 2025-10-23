import java.util.*;

public class Desorting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Read the length of the array for the current test case
			long[] a = new long[(int) n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong(); // Read the array elements
			}
			// Array input completed

			long operations = Long.MAX_VALUE; // Initialize operations to a large value
			for (int i = 0; i < n - 1; i++) { // Iterate through the array to check for sorted order
				if (a[i] <= a[i + 1]) { // Check if the current pair is sorted
					long diff = a[i + 1] - a[i]; // Calculate the difference between consecutive elements
					long required_operations = diff / 2 + 1; // Calculate the minimum operations needed to make them unsorted
					operations = Math.min(operations, required_operations); // Update the minimum operations
				} else {
					operations = 0; 
				}
			}

			System.out.println(operations); 
		}
		scanner.close();
	}
}
