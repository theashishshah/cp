import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Number of test cases
        int t = sc.nextInt();
        while(t-- > 0){
            int cells = sc.nextInt();
            String s = sc.next();
            boolean threeDots = false;
            int count = 0;
            int n = s.length();
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '.' && i + 1 < n && s.charAt(i + 1) == '.' && i + 2 < n && s.charAt(i + 2) == '.'){
                    threeDots = true;
                    break;
                }
                if(s.charAt(i) == '.') count++;
            }

            if(threeDots) {
                System.out.println(2);
            }else System.out.println(count);
        }
		sc.close();
	}
}

