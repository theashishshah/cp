import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ans = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if(num > ans) ans = num;
            }
            System.out.println(ans);
        }

        sc.close();
    }
}