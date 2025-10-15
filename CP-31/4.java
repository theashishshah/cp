import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Number of test cases
        int t = sc.nextInt();
        while(t-- > 0){
            int num = sc.nextInt();
            System.out.println( num % 3 == 0 ? "Second" : "First");
        }
		sc.close();
	}
}