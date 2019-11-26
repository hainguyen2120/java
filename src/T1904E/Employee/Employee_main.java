package T1904E.Employee;

import java.util.Scanner;

public class Employee_main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        Employee e = new Employee();

        int choice;
        do {
            System.out.println("---- begin menu----");
            System.out.println("1.Add");
            System.out.println("2.Show");
            System.out.println("3.Find by name");
            System.out.println("4.Exit");
            System.out.println("----End menu----");

            System.out.println("Enter choice: ");
            choice = s.nextInt();
            switch (choice){
                case 1:
                    e.inputInfo();
                    break;
                case 2:
                    e.showInfo();
                    break;
                case 3:
                    System.out.println("nhap dia chi moi: ");
                    s.nextLine();
                    String newAdd = s.nextLine();
                    e.changeAddress(newAdd);
                    break;
                case 4:
                    break;
            }
        }
        while (choice != 4);
        System.out.println("bye bye ....");
    }
}
