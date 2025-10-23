import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] nums = new long[(int) n];
        long min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            long currMin = sc.nextLong();
            long absMin = Math.abs(currMin);
            if(absMin < min) min = absMin;
        }
        System.out.println(min);
        sc.close();
    }
}