package app;

import java.util.Scanner;

public class ABC136B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++ ) {
            if (String.valueOf(i).length() % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}