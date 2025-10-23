import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            
            int zeros = 0, neg = 0, min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                if(num == 0) zeros++;
                else if(num < 0) {
                    neg++;
                    int absMin = Math.abs(num);
                    if(min > absMin) min = absMin;
                }
            }

            int ans = zeros;
            if(neg % 2 != 0){
                ans += min + 1;
            } 

            System.out.println(ans);
        }

        sc.close();
    }
}