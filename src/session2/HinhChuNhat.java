package session2;

import java.util.Scanner;

public class HinhChuNhat {
    public double canh1 ;
    public double canh2;

    public void inputHcn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong: ");
        canh1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("nhap chieu dai: ");
        canh2 = scanner.nextDouble();

    }

    public double tinhDienTich() {
        return (canh1 * canh2);
    }
    public double tinhChuVi(){
        return (canh1 + canh2)*2;
    }
}