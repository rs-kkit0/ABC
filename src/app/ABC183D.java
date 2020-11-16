// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ABC183D {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long w = sc.nextLong();
        String ans = "Yes";

        long[] sum = new long[200001];

        int tmax = 0;

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            tmax = Math.max(tmax, t);
            long p = sc.nextLong();

            sum[s] += p;
            sum[t] -= p;

        }

        long temp = 0;

        for (int i = 0; i < tmax; i++) {
            temp += sum[i];
            if (temp > w) {
                ans = "No";
                break;
            }
        }

        // Map<Long, Long> map = new HashMap<>();

        // for (long i = 0; i < n; i++) {
        // long si = sc.nextLong();
        // long ti = sc.nextLong();
        // long pi = sc.nextLong();

        // for (long j = si; j < ti; j++) {
        // if (map.containsKey(j)) {
        // map.put(j, map.get(j) + pi);
        // } else {
        // map.put(j, pi);
        // }
        // }
        // }

        // for (long key : map.keySet()) {
        // if (map.get(key) > w) {
        // ans = "No";
        // break;
        // }
        // }

        System.out.println(ans);

        sc.close();
    }
}