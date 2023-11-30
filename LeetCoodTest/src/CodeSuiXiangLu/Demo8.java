package CodeSuiXiangLu;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long sum = 1;
        while (true) {
            while (l > 0) {
                long t = l % 10;
                if (t == 0) {
                    l = l / 10;
                    continue;
                }
                sum = sum * t;
                l = l / 10;
            }
            System.out.println(sum);
            l = sum;

            if (sum < 10) {
                break;
            }
            sum = 1;
        }
    }
}
