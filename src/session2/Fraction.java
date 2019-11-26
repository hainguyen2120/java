package session2;

import jdk.internal.org.objectweb.asm.tree.FrameNode;

import java.util.Scanner;

public class Fraction {
    public int TuSo;
    public int MauSo;

    public Fraction(){
        System.out.println("Constructor khong tham so");
    }

    public int getTuSo() {
        return TuSo;
    }

    public void setTuSo(int tuSo) {
        TuSo = tuSo;
    }

    public int getMauSo() {
        return MauSo;
    }

    public void setMauSo(int mauSo) {
        MauSo = mauSo;
    }

    public Fraction(int a, int b){
        System.out.println("Constructor co tham so");
        while (!this.kiemTra(a,b)){
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap TuSo: ");
            a = sc.nextInt();
            System.out.println("nhap MauSo: ");
            b = sc.nextInt();
        }

        this.setTuSo(a);
        this.setMauSo(b);
    }

    public int getTuso(){
        return TuSo;
    }
    public void setTuso(){
        this.TuSo = TuSo;
    }
    public int getMauso(){
        return MauSo;
    }
    public void setMauso(){
        this.MauSo = MauSo;
    }
    public boolean kiemTra(int a, int b){
        return b != 0;
    }
    public void print(){
        System.out.println("phan so la: ");
    }
}