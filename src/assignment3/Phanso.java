package assignment3;

import static java.lang.System.in;
import java.util.Scanner;

public class Phanso {
    public int tu;
    public int mau;

    public Phanso(){
        nhapVaoPhanSo();

    }

    public int getTu(){
        return tu;
    }

    public void setTu(int tu){
        this.tu = tu ;
    }

    public int getMau(){
        return mau;
    }

    public void setMau(int mau){
        this.mau = mau;
    }
    public void nhapVaoPhanSo(){
        Scanner phanso = new Scanner(System.in);
        System.out.println("nhap tu so :");
        tu = phanso.nextInt();
        System.out.println("Nhap mau so :");
        mau = phanso.nextInt();

    }
    public int TimUCLN(int a,int b){
        while(a!= b){
            if (a>b){
                a -= b ;
            }else {
                b -=a ;
            }
        }
        return a;
    }
    public void rutGonPhanSo(){
        int i = TimUCLN(this.getTu(),this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
    public void nghicDaoPhanSo(){
        int ts =  1 /getTu();
        int ms =  1 /getMau();
    }
}