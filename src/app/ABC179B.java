// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ABC179B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        String ans = "No";

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == sc.nextInt()) {
                cnt++;
            } else {
                cnt = 0;
            }
            if (cnt >= 3) {
                ans = "Yes";
                break;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}