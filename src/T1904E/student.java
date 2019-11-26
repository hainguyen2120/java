package T1904E;

public class student {
    String stuName;
    int stuAge;

    void innit(){
        stuName = "Hai Nguyen";
        stuAge = 25;
    }
    void display(){
        System.out.println(stuName);
        System.out.println(stuAge);
    }

    public static void main(String[] args){
        student s = new student();
        s.innit();
        s.display();


    }
}
