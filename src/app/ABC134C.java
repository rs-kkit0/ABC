package app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ABC134C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a[] = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).toArray();
        int temp[] = Arrays.stream(a).sorted().toArray();
//        int a_max = temp[temp.length - 1];
//        int a_second = temp[temp.length - 2];

        int sorted[] = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        int a_max = sorted[0];
        int a_second = sorted[1];


        for (int i = 0; i < a.length; i++ ) {
            if (a[i] == a_max) System.out.println(a_second);
            if (a[i] != a_max) System.out.println(a_max);
        }
        sc.close();
    }
}