import java.util.*;

public class SequenceGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases
		while (t-- > 0) {
			long n = Scanner.nextLong(); // Length of sequence b
			List<Long> b = new ArrayList<>(); // List to store input sequence b
			List<Long> a = new ArrayList<>(); // List to store the reconstructed sequence a
			for (int i = 0; i < n; i++) {
				b.add(scanner.nextLong()); // Read the sequence b
			}
			// Initial input of sequence b is completed

			a.add(b.get(0)); // Always add the first element of b to a
			for (int i = 1; i < n; i++) {
				if (b.get(i) >= b.get(i - 1)) {
					a.add(b.get(i)); // If current element is greater than or equal to the previous, add it to a
				} else {
					a.add(b.get(i)); // Add the current element to a
					a.add(b.get(i)); // Add the current element again to a to ensure a[i-1] <= a[i]
				}
			}
			System.out.println(a.size()); // Output the size of the reconstructed sequence a
			for (Long num : a) {
				System.out.print(num + " "); // Output each element of the sequence a
			}
			System.out.println(); // New line after each test case
		}
		scanner.close();
	}
}

// Time Complexity (TC): O(n) = O(2*10^5)
// Space Complexity (SC): O(n) = O(2*10^5)