import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt();

            if (x != 1) {
                System.out.println("YES");
                System.out.println(n);
                for (int i = 0; i < n; i++) System.out.print(1 + " ");
                System.out.println();
            } else {
                if (k == 1 || (k == 2 && n % 2 == 1)) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    if (n % 2 == 0) {
                        System.out.println(n / 2);
                        for (int i = 0; i < n / 2; i++) System.out.print(2 + " ");
                        System.out.println();
                    } else {
                        int total = (n - 3) / 2 + 1;
                        System.out.println(total);
                        for (int i = 0; i < total - 1; i++) System.out.print(2 + " ");
                        System.out.println(3);
                    }
                }
            }
        }
        sc.close();
    }
}

