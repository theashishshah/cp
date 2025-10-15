import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int cells = sc.nextInt();
            String s = sc.next();

            int totalDots = 0, consecutive = 0;
            boolean tripple = false;
            for(char c: s.toCharArray()){
                if(c == '.'){
                    totalDots++;
                    consecutive++;
                    if(consecutive == 3) {
                        tripple = true;
                        break;
                    }
                }else consecutive = 0;
            }
            System.out.println(tripple ? 2 : totalDots);

        }
        sc.close();
    }
}