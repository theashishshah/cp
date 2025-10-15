import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            sc.nextLine();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            boolean isExist = false;
            for(int num : arr) {
                if(num == k) {
                    isExist = true;
                    break;
                }
            }
            System.out.println(isExist ? "Yes" : "No");
            

        }

        sc.close();
    }
}