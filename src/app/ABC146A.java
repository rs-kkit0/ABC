package app;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ABC146A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> list = Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");
        System.out.println(7 - list.indexOf(s));

        sc.close();
    }
}