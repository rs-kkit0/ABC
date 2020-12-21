// 提出時に消す
package app;

import java.util.Scanner;
import java.util.stream.IntStream;

// 提出時にMainに変更する
// public class Main {
public class ABC185A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(IntStream.range(0, 4).map(e -> sc.nextInt()).min().getAsInt());

        sc.close();
    }
}