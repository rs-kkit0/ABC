package app;

import java.util.Scanner;

public class ABC145B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        if (s.substring(0, n / 2).equals(s.substring(n / 2))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}