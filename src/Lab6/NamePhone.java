package Lab6;

public class NamePhone {
    private String name;
    private String number;

    public NamePhone() {
    }

    public NamePhone(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
