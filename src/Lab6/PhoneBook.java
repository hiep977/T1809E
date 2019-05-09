package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PhoneBook extends Phone {
    List<NamePhone> phoneList = new ArrayList();
    NamePhone namePhone = null;

    public PhoneBook() {
    }

    void insertPhone(String name, String phone) {
        int kt1 = false;
        int kt2 = false;
        Iterator list = this.phoneList.iterator();

        while(true) {
            NamePhone namePhone;
            do {
                if (!list.hasNext()) {
                    if (kt1 && kt2) {
                        System.out.println("Nhap ten va sdt bi trung!");
                    } else if (!kt1 && !kt2) {
                        this.namePhone = new NamePhone(name, phone);
                        this.phoneList.add(this.namePhone);
                    } else if (kt2 && !kt1) {
                        this.namePhone.setNumber(this.namePhone.getNumber() + " : " + phone);
                    }

                    return;
                }

                namePhone = (NamePhone)list.next();
            } while(!namePhone.getName().equals(name));

            String[] listPhoneNumber = namePhone.getNumber().split("\\s:\\s");
            String[] var11 = listPhoneNumber;
            int var10 = listPhoneNumber.length;

            for(int var9 = 0; var9 < var10; ++var9) {
                String s = var11[var9];
                if (s.equals(phone)) {
                    kt1 = true;
                    break;
                }
            }

            kt2 = true;
        }
    }

    void removePhone(String name) {
        Iterator list = this.phoneList.iterator();

        while(list.hasNext()) {
            NamePhone namePhone = (NamePhone)list.next();
            if (namePhone.getName().equals(name)) {
                list.remove();
            }
        }

    }

    void updatePhone(String name, String newphone) {
        Iterator list = this.phoneList.iterator();

        while(list.hasNext()) {
            NamePhone namePhone = (NamePhone)list.next();
            if (namePhone.getName().equals(name)) {
                namePhone.setNumber(newphone);
            }
        }

    }

    void searchPhone(String name) {
        Iterator list = this.phoneList.iterator();

        while(list.hasNext()) {
            NamePhone namePhone = (NamePhone)list.next();
            if (namePhone.getName().equals(name)) {
                System.out.println("Name : " + namePhone.getName() + ", Phone: " + namePhone.getNumber());
            }
        }

    }

    void sort() {
        Collections.sort(this.phoneList, new Comparator<NamePhone>() {
            public int compare(NamePhone o1, NamePhone o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    void showListPhone() {
        Iterator var2 = this.phoneList.iterator();

        while(var2.hasNext()) {
            NamePhone namePhone = (NamePhone)var2.next();
            System.out.println("Name : " + namePhone.getName() + ", Phone: " + namePhone.getNumber());
        }

    }
}