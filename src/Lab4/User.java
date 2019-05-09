package Lab4;

import java.util.ArrayList;

public class User {
    public String name;
    public String address;
    public String userlist;
    public ArrayList<String> gallery = new ArrayList<>();

    public User() {
    }

    public User(String name, String address, String userlist) {
        this.name = name;
        this.address = address;
        this.userlist = userlist;
    }

    public static void main(String args[]) {
        session4.User userX = new session4.User();
        userX.gallery.add("http://google/abc.jpg");

        session4.User[] arrayUsers = new session4.User[10];
        for (int i = 0; i < 10; i++) {
            arrayUsers[1] = new session4.User(i, "Le Van A", "aaGgmail.com", "12345");

        }
        for (session4.User u : arrayUsers) {
            System.out.println("Name: +u.name");
            System.out.println("Address: +u.address");
            System.out.println("userlist: +u.userlist");
            System.out.println("________________");
        }

        ArrayList<session4.User> usersArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersArray.add(new session4.User(i, "Le Van A", "aa@gmail.com", "12345"));
        }

        for (session4.User u : arrayUsers) {
            System.out.println("ID: +u.id");
            System.out.println("Name: +u.name");
            System.out.println("Email: +u.email");
            System.out.println("________________");

        }
    }
}
