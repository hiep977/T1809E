package session1;

import java.util.Scanner;

public class Timsonguyento {
    public static void main(String[] args) {
        Timsonguyento timsonguyento = new Timsonguyento();
        while (true){
            timsonguyento.timsonguyento();
        }
    }
 public void timsonguyento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap 1 so: ");
        int n = scanner.nextInt();
        if(n<=2){
            System.out.println("khong co so nguyen to nao: ");
        } else {
            System.out.println("cac so nguyen to la: ");
            for (int i = 2; i < n; i++) {
                if(kiemtrasonguyento(i)){
                    System.out.println(i);
                }
      }
  }
}
public boolean kiemtrasonguyento(int n){
        int id = n/2;
        int dem = 0;
        for (int i = 0; i < id; i++) {
            if (n%2==0)
                dem++;
            if(dem > 1)return false;
        }
        return true;
    }
}