import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Length of array a
			long[] a = new long[(int) n]; // Array a of length n
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong(); // Read elements of array a
			}

			// Find the maximum element in array a
			long mx = Arrays.stream(a).max().getAsLong();
			List<Long> b = new ArrayList<>(); // Array b
			List<Long> c = new ArrayList<>(); // Array c

			// Distribute elements into b and c
			for (long value : a) {
				if (value != mx) {
					b.add(value); // Add to b if not the maximum
				} else {
					c.add(value); // Add to c if it is the maximum
				}
			}

			// Check if array b is empty, meaning all elements were the same
			if (b.size() == 0) {
				System.out.println(-1); // No valid distribution possible
			} else {
				// Output the sizes of arrays b and c
				System.out.println(b.size() + " " + c.size());
				// Output elements of array b
				for (long value : b) {
					System.out.print(value + " ");
				}
				System.out.println();
				// Output elements of array c
				for (long value : c) {
					System.out.print(value + " ");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
