import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static long query(int type, int l, int r) {
        System.out.println(type + " " + l + " " + r);
        System.out.flush();
        return sc.nextLong();
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            long sumP = query(1, 1, n);
            long sumA = query(2, 1, n);
            long len = sumA - sumP;

            int low = 1, high = n;
            while (low < high) {
                int mid = (low + high) / 2;
                long prefP = query(1, 1, mid);
                long prefA = query(2, 1, mid);
                long diff = prefA - prefP;

                if (diff == 0) low = mid + 1;
                else high = mid;
            }

            int l = low;
            int r = (int)(l + len - 1);
            System.out.println("! " + l + " " + r);
            System.out.flush();
        }
    }
}
