import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int overallMin = 1;  
            int overallMax = n;  
            
            for(int i = 0; i < m; i++) {
                int l = sc.nextInt() - 1; 
                int r = sc.nextInt() - 1;
                int minVal = Integer.MAX_VALUE;
                int maxVal = Integer.MIN_VALUE;
                for(int j = l; j <= r; j++) {
                    minVal = Math.min(minVal, a[j]);
                    maxVal = Math.max(maxVal, a[j]);
                }
                overallMin = Math.max(overallMin, minVal + 1); 
                overallMax = Math.min(overallMax, maxVal - 1); 
            }
            
            StringBuilder sb = new StringBuilder();
            for(int x = 1; x <= n; x++) {
                if(x >= overallMin && x <= overallMax) sb.append('1');
                else sb.append('0');
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
