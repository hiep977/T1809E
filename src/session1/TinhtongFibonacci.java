package session1;

import java.util.Scanner;

public class TinhtongFibonacci {
    public static void main(String[] args) {
        TinhtongFibonacci tinhtongFibonacci = new TinhtongFibonacci();
        while (true){
            tinhtongFibonacci.Fibonacci();
        }
    }
public void Fibonacci (){
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        int fn = 0;
        int fn1 = 1;
        int fn2;
        System.out.println("Moi nhap so n: ");
        int n = scanner.nextInt();
        System.out.println("Tong la:  "+n+" so dau tien cua day fibonacci la: ");
        if(n==1){
            System.out.println(0);
            System.out.println("-------------------");
            return;
        }
        if (n==2){
            System.out.println(1);
            System.out.println("------------------");
            return;
        }
        for (int i = 3; i <= n; i++) {
            fn2 = fn + fn1;
            sum += fn2;
            fn = fn1;
            fn1 = fn2;
        }
        System.out.println(sum);
        System.out.println("---------------------");
    }
}
