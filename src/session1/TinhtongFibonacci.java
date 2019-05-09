package session1;

import java.util.Scanner;

public class TinhtongFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int fibonaci = 1;
        int a = 0;
        int b = 1;
        for (int i = 0; i <= n ; i++) {
            if (i <= 1) sum = i;
            else {
                sum = a + b;
                a = b;
                b = sum;
                fibonaci = fibonaci + sum;
            }
        }System.out.println("Tong cac so fibonaci la: " + fibonaci);
    }
}