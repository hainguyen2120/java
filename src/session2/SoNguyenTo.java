package session2;

import java.util.Scanner;

public class SoNguyenTo {
    public int a = 2;

    public static boolean isSoNguyenTo(int x){
        for (int i=2;i<=x/2;i++){
            if(x%i==0) return false;
        }
        return true;
    }

    public int timSoNguyenToTiepTheo(){
        for (int i=a+1;true;i++){
            if(isSoNguyenTo(i)){
                return i;
            }
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (isSoNguyenTo(a)) {
            this.a = a;
            return;
        }
        System.out.println("day khong phai la so nguyen to");
    }

    public static void main(String[] args){
        SoNguyenTo snt = new SoNguyenTo();
        for (int i=0;i<10;i++){
            snt.setA(snt.timSoNguyenToTiepTheo());
            System.out.println(snt.getA());
        }
        snt.setA(43);
        System.out.println("Next "+snt.timSoNguyenToTiepTheo());
    }
}
