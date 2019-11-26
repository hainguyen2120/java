package T1904E;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("moi ban nhap vao so thu 1: ");
        System.out.println("moi ban nhap vao so thu 2: ");
        System.out.println("Ket qua cua ban nhu sau: ");

        int i = s.nextInt();
        int j = s.nextInt();

        System.out.println("ket qua cua phep cong la: "+(i+j));
        System.out.println("ket qua cua phep tru la: "+(i-j));
        System.out.println("ket qua cua phep nhan la: "+(i*j));
        if (j == 0){
            System.out.println("khong thuc hien duoc phep chia");
        }
        System.out.println("ket qua phep chia la: "+(i/j));
    }
}
