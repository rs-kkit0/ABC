package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        sc.close();
    }
}