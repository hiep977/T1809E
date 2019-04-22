package session2;

import java.util.Scanner;

public class Human {
    public String name ;
    public int age;
    public String country;
    public String Address;
    public int canh1;
    public int canh2;

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name");
        name = scanner.nextLine();
        System.out.println("age :");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Country  :");
        country = scanner.nextLine();
        System.out.println("address");
        Address = scanner.nextLine();

    }
    public void showInfo(){
        System.out.println("name :" + name);
        System.out.println("age :" + (age)*2);
        System.out.println("country: " + country);
        System.out.println("address : " + Address);

    }
}