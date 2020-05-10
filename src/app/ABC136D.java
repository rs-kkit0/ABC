package app;

import java.util.Scanner;

public class ABC136D {
    static String s;
    static String r;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        s = sc.next();
        StringBuilder sb = new StringBuilder();
        r = sb.append(s).reverse().toString();
    
        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++ ) {
            System.out.println(task(s.charAt(i), i));
            ans[task(s.charAt(i), i)]++;
        }

        for (int i = 0; i < ans.length; i++ ) {
            if (i > 0) System.out.print(" ");
            System.out.print(ans[i]);
        }
        sc.close();
    }   

    public static int task(char c, int n) {
        if (c == 'R') {
            if((s.indexOf("L", n) - n) % 2 == 1) {
                return s.indexOf("L", n);
            } else {
                return s.indexOf("L", n) - 1;
            }
        } else { //c == 'L'
            if((r.indexOf("R", n) - n) % 2 == 1) {
                return r.indexOf("R", n);
            } else {
                return r.indexOf("R", n) - 1;
            }
        }
    }
}