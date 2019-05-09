package session3;

import java.util.Scanner;

public class HinhTamGiac {

    public static void main(String[] args) {
        int a, b, c;
        float s, cv;
        a = NhapSoNguyen("Nhap canh a: ");
        b = NhapSoNguyen("Nhap canh b: ");
        c = NhapSoNguyen("Nhap canh c: ");
        s = dientich(a, b, c);
        cv = chuvi(a, b, c);
        System.out.println("Chu vi hinh tam giac la: " + cv);
        System.out.println("Dien tich hinh tam giac la: " + s);
    }

    public static int NhapSoNguyen(String str) {
    int x;
    Scanner sc=new Scanner(System.in);
    System.out.println(str);
    x=sc.nextInt();
    return x;
    }

    public static float chuvi(int a,int b,int c) {
        return (float) (a + b + c) / 2;
        }
    public static float dientich(int a,int b,int c){
        float p=(float)(a+b+c)/2;
        float sd;
        sd=(float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return sd;
        }
    }


