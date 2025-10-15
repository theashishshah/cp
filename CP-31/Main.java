import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(); // Number of teams
            int[] nums = new int[n - 1];
            for(int i = 0; i < n - 1; i++) nums[i] = sc.nextInt();
            int ans = 0;
            for(int num: nums) ans += num;
            ans = - ans;
            System.out.println(ans);
        }
        sc.close();
    }
}