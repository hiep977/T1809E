package Lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class classRoom {
    public String tenPhong;
    public int Vitri;
    public ArrayList<User> dsUser;

    public classRoom(){
    }
    public classRoom(String tenPhong, int vitri){
        this.tenPhong = tenPhong;
        this.Vitri = vitri;
        this.dsUser = new ArrayList<>();
    }
    public void themNguoi (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhao ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap Name: ");
        String name = scanner.nextLine();
        System.out.println("Nhap email: ");
    }
}
