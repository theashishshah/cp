import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int last = a[n - 1];
            int pick = 1;
            for (int i = 1; i <= n; i++) {
                if (i != last) {
                    pick = i;
                    break;
                }
            }

            for (int i = 0; i < k; i++) {
                System.out.print(pick + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
