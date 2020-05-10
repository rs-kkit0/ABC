package app;

import java.util.HashMap;
import java.util.Scanner;

public class ABC147C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] a = new boolean[n];
        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt();
            for (int j = 0; j < ai; j++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(sc.nextInt(), sc.nextInt());
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i]) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}