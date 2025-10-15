import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); ;;
		while (t-- > 0) {
			long n = scanner.nextLong(); 
			long k = scanner.nextLong(); 
			long[] a = new long[(int) n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong(); 
			}

			
			long[] copy_a = Arrays.copyOf(a, a.length);
			Arrays.sort(copy_a); 

			
			if (Arrays.equals(copy_a, a) || k > 1) {
				System.out.println("YES"); 
			} else {
				System.out.println("NO"); 
			}
		}
		scanner.close();
	}
}
