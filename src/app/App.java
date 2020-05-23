// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        sc.close();
    }
}