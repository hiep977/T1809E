package assignment2;

public class Songuyento {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(isSonguyento(a)){
            this.a = a;
        }else {
            System.out.println("Không set.");
        }
    }

    public boolean isSonguyento(int x){
        int id = x/2;
        int count = 0;
        for (int i = 0; i < id; i++) {
            if (x%2==0) count++;
            if(count > 1)return false;
        }
        return true;
    }

    public int timSoNguyenToTiepTheo(){
        for (int i = (this.a + 1) ; ; i++) {
            if(isSonguyento(i)){
                return i;
            }
        }
    }
}