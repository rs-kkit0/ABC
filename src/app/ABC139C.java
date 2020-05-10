package app;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC139C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = IntStream.range(0, n - 1).map(e -> sc.nextInt()).toArray();

        for (int i = 0; i < h.length; i++) {

        }

        System.out.println(sc.next());
        sc.close();
    }
}