package app;

import java.util.Scanner;
import java.util.stream.IntStream;


public class ABC135C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = IntStream.range(0, n + 1).map(i -> sc.nextInt()).toArray();
        int b[] = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();

        int ans = 0;

        for (int i = 0; i < n; i++ ) {
            int temp = Math.min(a[i], b[i]); //i番目の町の勇者がi番目の町のモンスターを全力で倒す
            int temp2 = Math.min(a[i + 1], b[i] - a[i]); //i番目の町の勇者が残った力で1+1番目の町のモンスターを倒す

            a[i + 1] = temp2;
        }
        
        System.out.println(ans);

        sc.close();
    }

}