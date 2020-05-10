package app;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC154C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = IntStream.range(0, n).map(e -> sc.nextInt()).boxed().distinct().count();
        if (a == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}