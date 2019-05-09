package session1;

import java.util.Scanner;

public class Timsonguyento {
public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     System.out.println("Moi nhap 1 so: ");
         int n = scanner.nextInt();
         int dem;
         while (n < 2) {
      System.out.println("Nhap 1 so khac: ");
      n = scanner.nextInt();
        }
        for (int i = 2; i <= n; i++) {
            dem  = 0;
         for (int j = 2; j < i; j++) {
             if (i % j != 0) { dem++;
                }
            }
            if (dem == (i - 2)) {
             System.out.println("Cac so nguyen to la: " + i);
            }
        }
    }
}