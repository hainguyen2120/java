package T1904E;

import sun.lwawt.macosx.CSystemTray;
import sun.tools.jstat.SyntaxException;

import java.util.Scanner;

public class testOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//
//        System.out.print("Input value1: ");
//        int value1 = s.nextInt();
//
//        System.out.print("Input value2: ");
//        int value2 = s.nextInt();
//
//        System.out.print("value1 == value2: "+(value1 == value2));
//        System.out.println("value1 == value2");
//
//        System.out.print("value1 != value2: ");
//        System.out.println("value1 != value2");
//
//        System.out.print("value1 > value2: ");
//        System.out.println("value1 > value2");
//
//        System.out.print("value1 < value2: ");
//        System.out.println("value1 < value2");

//        int x = s.nextInt();
//        if (x % 2 == 0) {
//            System.out.println(x + "la so chan");
//        } else {
//            System.out.println(x + "la so le");
//        }
//        System.out.println("bye bye.....");


        int choice;
        while (true) {
            System.out.println("---- begin menu----");
            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Mul");
            System.out.println("4.Div");
            System.out.println("0.Exit");
            System.out.println("----End menu----");

            System.out.println("Enter choice: ");
            choice = s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add .....");
                    break;
                case 2:
                    System.out.println("Sub .....");
                    break;
                case 3:
                    System.out.println("Mul .....");
                    break;
                case 4:
                    System.out.println("Div .....");
                    break;
//                default:
////                    System.out.println("Invalid ...");
            }
            if (choice == 0)  {
                break;
            }
        }
        System.out.println("bye bye ....");


        // vong lap vo han voi for
//        for(int i=1, j = 10; i<j; i++, j--){
//            System.out.println("i*j = "+(i*j));
//        }
//        for (int i = 1, j = 10; i<10 && j>5; i++, j--){
//            System.out.println("i*j = "+(i*j));
//        }

        for (int i=1;i<10;i++){
            if (i % 2 == 0){
                System.out.println(i +"la so chan");
                continue;
            }
            System.out.println("for running");
        }
        System.out.println("bye bye ....");
    }
}
