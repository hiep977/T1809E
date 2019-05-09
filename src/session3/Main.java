package session3;

public class Main {
    public static void main(String args[]){
        HinhTamGiac hinhtamgiac = new HinhTamGiac();
        hinhtamgiac.NhapSoNguyen();
        System.out.println("Chu vi: "+hinhtamgiac.chuvi());
        System.out.println("Dien tich: "+hinhtamgiac.dientich());
    }
}