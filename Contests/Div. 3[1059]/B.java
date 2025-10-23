import java.util.*;

public class Main {
    static boolean isPalindrome(String s){
        int start = 0, end = s.length() - 1;
        while (start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return  false;
        }

        return  true;
    }

    static boolean isNonDecreasing(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) < s.charAt(i - 1)) return  false;
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean found = false;
            for(int mask = 0; mask < (1 << n); mask++){
                StringBuilder p = new StringBuilder();
                StringBuilder x = new StringBuilder();
                List<Integer> ind = new ArrayList<>();
                for(int i = 0; i < n; i++){
                    if((mask & (1 << i)) != 0){
                        p.append(s.charAt(i));
                        ind.add(i + 1);
                    }else x.append(s.charAt(i));
                }

                if(isNonDecreasing(p.toString()) && isPalindrome(x.toString())){
                    System.out.println(ind.size());
                    for(int index: ind) System.out.print(index + " ");
                    System.out.println();
                    found = true;
                    break;
                }
            }
            if(!found) System.out.println(-1);

        }

        sc.close();
    }
}