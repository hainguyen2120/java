package T1904E.Employee;

import java.util.Scanner;

public class Employee {
    private String name;
    private String address;
    private String tell;
    private int bithYear;
    private int joinYear;

    public void inputInfo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = s.nextLine();

        System.out.println("Enter address: ");
        address = s.nextLine();

        System.out.println("Enter tell: ");
        tell = s.nextLine();

        System.out.println("Enter birth year: ");
        bithYear = s.nextInt();

        System.out.println("Enter join year: ");
        joinYear = s.nextInt();
    }

    public void showInfo() {
        System.out.println("------- begin show -------");
        System.out.println("Name: "+name);
        System.out.println("address: "+address);
        System.out.println("tell: "+tell);
        System.out.println("birthYear: "+bithYear);
        System.out.println("joinYear: "+joinYear);
        System.out.println("------- end show ---------");
    }

    public void changeAddress(String newAdd) {
        address = newAdd;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {

        this.tell = tell;
    }

    public int getBithYear() {

        return bithYear;
    }

    public void setBithYear(int bithYear) {

        this.bithYear = bithYear;
    }

    public int getJoinYear() {

        return joinYear;
    }

    public void setJoinYear(int joinYear) {

        this.joinYear = joinYear;
    }
}

