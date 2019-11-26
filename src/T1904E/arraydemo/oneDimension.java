package T1904E.arraydemo;

import T1904E.Employee.Employee;

public class oneDimension {
    int[] marks;

    Employee[] arrayEmployee = new Employee[2];

    public void addEmployee(){
        for (int i = 0; i < arrayEmployee.length; i++){
            Employee e1 = new Employee();
            e1.inputInfo();
            arrayEmployee[0] = e1;
        }
    }

    public void showArrayEmployee(){
        System.out.println(arrayEmployee[0]);

        for (int i = 0; i < arrayEmployee.length; i++){
            Employee e1 = arrayEmployee[i];
            e1.showInfo();
//            System.out.println(e1.getName() +"," +e1.getAddress());
        }
    }

    public void storeMarks() {
        marks = new int[4];
        marks[0] = 65;
        marks[1] = 47;
        marks[2] = 75;
        marks[3] = 50;
    }

    public void show(){
        System.out.println(marks[0]);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
    public static void main(String[] args) {
        oneDimension one = new oneDimension();
//        one.storeMarks();
//        one.show();
        one.addEmployee();
        one.showArrayEmployee();
    }
}
