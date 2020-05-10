package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;
import java.util.Comparator;

public class ABC086C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String ans = "Yes";
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();

        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++ ) {
            int key = sc.nextInt();
            int[] values = {sc.nextInt(), sc.nextInt()};
            map.put(key, values);
        }
//        Map<Integer, int[]> sortedMap = map.entrySet().stream().sorted(java.util.Map.Entry.comparingByKey());

        map.entrySet().stream().sorted().forEach(s -> System.out.println(s.getValue()[0]));
        sc.close();
    }
}