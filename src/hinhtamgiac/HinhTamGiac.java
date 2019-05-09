package hinhtamgiac;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HinhTamGiac {
    private int ma;
    private int mb;
    private int mc;

    public HinhTamGiac(){
        ma=mb=mc=0;
    }
    public HinhTamGiac(int a,int b,int c){
        if(a<0){
            JOptionPane.showMessageDialog(null,"canh phai >0",
                    "Thong bao",JOptionPane.WARNING_MESSAGE);
            ma=0;
            return;
        }
        if(b<0){
            JOptionPane.showMessageDialog(null,"canh phai >0",
                    "Thong bao",JOptionPane.WARNING_MESSAGE);
            mb=0;
            return;
        }
        if(c<0){
            JOptionPane.showMessageDialog(null,"canh phai >0",
                    "Thong bao",JOptionPane.ERROR_MESSAGE);
            mc=0;
            return;
        }
        if(a+b<=c||a+c<=b||b+c<=a) {
            JOptionPane.showMessageDialog(null,"Khong phai tam giac",
                    "Thong bao",JOptionPane.ERROR_MESSAGE);
            ma=mb=mc=0;
            return;
        }
        ma=a;
        mb=b;
        mc=c;
    }
    //Get methods
    public int getCanhA(){
        return ma;
    }
    public int getCanhB(){
        return mb;
    }
    public int getCanhC(){
        return mc;
    }
    //set methods
    public void setCanhA(int a){
        ma=a;
    }
    public void setCanhB(int b){
        mb=b;
    }
    public void setCanhC(int c){
        mc=c;
    }
    public boolean laTamGiac(){
        return(ma+mb>mc&&ma+mc>mb&&mb+mc>ma);
    }
    public boolean laTamGiac(int a,int b,int c){
        return(a+b>c&&a+c>b&&b+c>a);
    }
    public int getChuvi(){
        return ma+mb+mc;
    }
    public double getDienTich(){
        double p=(double)(ma+mb+mc)/2;
        return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
    }
    public static void main(String[] args) {
        System.out.println("nhap ba canh hinh tam giac");
        Scanner input=new Scanner(System.in);
        int ma=input.nextInt();
        int mb=input.nextInt();
        int mc=input.nextInt();
        HinhTamGiac tamgiac=new HinhTamGiac(ma,mb,mc);
        if(tamgiac.laTamGiac()){
            System.out.println("Chu vi: "+tamgiac.getChuvi());
            System.out.println("Dien tich: "+tamgiac.getDienTich());
        }
    }
}