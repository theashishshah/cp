import java.util.*;

public class Main {
    static int msbIndex(int x) {
        return x == 0 ? -1 : 31 - Integer.numberOfLeadingZeros(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int msbA = msbIndex(a);
            int msbB = msbIndex(b);

            if (msbB > msbA) {
                System.out.println(-1);
                continue;
            }

            if (a == b) {
                System.out.println(0);
                continue;
            }

            List<Integer> ops = new ArrayList<>();
            for (int i = 0; i <= msbA; i++) {
                if (((a >> i) & 1) != ((b >> i) & 1)) {
                    int x = 1 << i;
                    ops.add(x);
                    a ^= x;
                }
            }

            if (a != b) {
                System.out.println(-1);
            } else {
                System.out.println(ops.size());
                if (!ops.isEmpty()) {
                    for (int i = 0; i < ops.size(); i++) {
                        if (i > 0) System.out.print(" ");
                        System.out.print(ops.get(i));
                    }
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
