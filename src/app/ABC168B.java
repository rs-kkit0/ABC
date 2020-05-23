// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
public class ABC168B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String s = sc.next();

        if (s.length() <= k) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(0, k) + "...");
        }
        sc.close();
    }
}