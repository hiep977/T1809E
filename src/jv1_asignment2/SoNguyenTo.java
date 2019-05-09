package jv1_asignment2;

public class SoNguyenTo {
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (isSoNguyenTo(a)) {
            this.a = a;

        } else {
            System.out.println("khong set gia tri");
        }
    }

    public boolean isSoNguyenTo(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int timSoNguyenToTiepTheo() {
        for (int i = a + 1; true; i++) {
            if (isSoNguyenTo(i)) {
            }
        }
    }
}
