package app;

import java.util.Scanner;

public class ABC142A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double ans;
        if (n % 2 == 0) {
            ans = 0.5;
        } else {
            ans = (n - ((n - 1) / 2)) / n;
        }
        System.out.println(ans);
        sc.close();
    }
}