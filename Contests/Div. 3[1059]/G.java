import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 2 || n == 3) {
                System.out.println(-1);
                continue;
            }

            for (int i = 1; i <= n - 2; i++) {
                System.out.println(i + " " + (i + 1));
            }
            System.out.println((n - 2) + " " + n);
        }
        sc.close();
    }
}
