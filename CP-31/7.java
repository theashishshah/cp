import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            sc.nextLine();

            String x = sc.next();
            String s = sc.next();
            if(x.contains(s)){
                System.out.println(0);
                continue;
            }

            int count = -1;
            while(true){
                x += x;
                count++;
                if(x.contains(s)) break;
                if(x.length() > 2 * s.length()) {
                    count = -1;
                    break;
                }
            }
            System.out.println(count == -1 ? -1 : count + 1);
        }

        sc.close();
    }
}