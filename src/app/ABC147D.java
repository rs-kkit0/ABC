package app;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC147D {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int mod = 1000000007;
        System.out.println(IntStream.range(0, sc.nextInt()).map(e -> sc.nextInt() % mod).sum());
        sc.close();
    }
}