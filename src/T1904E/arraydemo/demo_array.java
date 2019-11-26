package T1904E.arraydemo;

import java.util.Scanner;

public class demo_array {
    int[] values = new int[10];
    public void input(){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < values.length; i++){
            values[i] = s.nextInt();
        }
    }

    public void add(){
        int total = 0;
        for (int i = 0; i < values.length;i++){
            total += values[i];
        }
        System.out.println("ket qua phep cong: "+total);
    }

    public void sub(){
        int total = 0;
        for (int i = 0; i < values.length; i++){
            total -= values[i];
        }
        System.out.println("ket qua phep tru: "+total);
    }

    public void mul(){
        int total = 1;
        for (int i = 0; i < values.length; i++){
            total *= values[i];
        }
        System.out.println("ket qua phep nhan: "+total);
    }

    public void div(){
        int total = 1;
        for (int i = 0; i < values.length; i++){
            total /= values[i];
        }
        System.out.println(total);
    }

    public static void main(String[] args){
        demo_array demo = new demo_array();
        demo.input();
        demo.add();
        demo.sub();
        demo.mul();
        demo.div();
    }
}
