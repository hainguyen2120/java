package T1904E;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Hello World ...");

        int empNumber;
        float salary;
        System.out.println("Enter shareSalary: ");
        double shareSalary = s.nextDouble();
        char gender = 'M';
        boolean ownVehicle = false;
        empNumber = 101;
        salary = 1000000.5f;

        //in ra man hinh
        System.out.println("Emp number: " + empNumber);
        System.out.println("Emp salary: " + salary);
        System.out.println("Emp shareSalary: " + shareSalary);
        System.out.println("Emp gender: " + gender);
        System.out.println("Emp ownVehicle: " + ownVehicle);
    }
}
