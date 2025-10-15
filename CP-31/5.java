import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
            int smallest = nums[0];
            for(int num : nums){ 
                if(num < smallest) {
                    smallest = num;
                    break;
                }
            }
            System.out.println(smallest == nums[0] ? "Yes" : "No");
        }
        sc.close();
    }
}