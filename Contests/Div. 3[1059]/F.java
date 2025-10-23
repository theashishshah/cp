import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            for (int i = 0; i < m; i++) {
                sc.nextInt(); 
                sc.nextInt(); 
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
