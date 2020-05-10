package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class SyainInfo {
    int syainNo;
    int joushiNo;
    int salary;

    SyainInfo(int syainNo, int joushiNo) {
        this.syainNo = syainNo;
        this.joushiNo = joushiNo;
        this.salary = -1;
    }

    public int getSalary() {
        if (salary == -1) {
            this.salary = ABC026C.calc(syainNo);
        }
        return this.salary;
    }

    public int getJoushiNo() {
        return joushiNo;
    }

}

public class ABC026C {

    private static ArrayList<SyainInfo> infoList = new ArrayList<SyainInfo>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        infoList.add(new SyainInfo(1, -1));

        for (int i = 2; i <= N; i++) {
            infoList.add(new SyainInfo(i, sc.nextInt()));
        }

        System.out.println(calc(1));

        sc.close();
    }

    public static int calc(int syainNo) {
        SyainInfo[] info = (SyainInfo[]) infoList.stream().filter(i -> i.joushiNo == syainNo).toArray();
        if (info.length == 0) {
            return 1;
        } else {
            Arrays.sort(info);
            return info[0].getSalary() + info[info.length - 1].getSalary() + 1;
        }
    }
}
