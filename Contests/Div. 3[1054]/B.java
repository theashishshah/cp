import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++) nums[i] = sc.nextInt();

            Arrays.sort(nums);
            // keep track of the max dist
            // get the min vlaue of the all the max
            int ans = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for(int i = 1; i < n; i += 2){
                int dist = Math.abs(nums[i] - nums[i -1]);
                if(dist > max){
                    max = dist;
                    ans = Math.min(max, ans);
                }
            }
            System.out.println(ans);
        }
 
        sc.close();
    }
}