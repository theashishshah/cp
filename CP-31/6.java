import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> occ = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                occ.put(num, occ.getOrDefault(num, 0) + 1);
            }

            if (occ.size() > 2) {
                System.out.println("No");
            } else if (occ.size() == 1) {
                System.out.println("Yes");
            } else {
                int[] nums = new int[2];
                int i = 0;
                for (int num : occ.keySet()) {
                    nums[i++] = num;
                }

                int freq1 = occ.get(nums[0]);
                int freq2 = occ.get(nums[1]);

                if (freq1 == freq2) {
                    System.out.println("Yes");
                } else if (n % 2 == 1 && Math.abs(freq1 - freq2) == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }

        sc.close();
    }
}
