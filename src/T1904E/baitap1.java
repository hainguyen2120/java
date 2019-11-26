package T1904E;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("nhap num: ");

        int num = s.nextInt();

        if (num % 2 == 0){
            System.out.println( num +"la so chan");
        }else {
            System.out.println(num +"la so le");
        }
        //tinh tong cac so chan < i
        int total_chan = 0;
        int total_chia_3 = 0;
        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                total_chan = total_chan +i;
            }
            if (i % 3 == 0){
                total_chia_3 = total_chia_3 + i;
            }
        }
        System.out.printf("tong cac so chan tu 1 den %d la: %d", num, total_chan);
        System.out.println("tong cac so chia het ho 3 tu 1 den "+num + "la: "+total_chia_3);
    }
}
