package session2;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Session2 {
    private  String name;
    public int age;

        public static String abc = "good";

        public Session2(){
            inputInfo();
            showInfo();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


    public void showInfo(){
        System.out.println("fullname: "+name);
        //System.out.println("fullname: "+this.name);
        System.out.println("Age: "+age);
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        setName(sc.nextLine());
        System.out.println("nhap tuoi: ");
        setAge(sc.nextInt());
    }

    public static void main(String[] args){
        Session2 ss2 = new Session2();
        ss2.inputInfo();
        ss2.showInfo();
        Session2 ss3 = new Session2();
        ss3.inputInfo();
        ss3.showInfo();
        System.out.println("so sanh");
        System.out.println("SS2 name: "+ss2.getName());
        System.out.println("SS3 name: "+ss3.getName());

    }

    public static void sayHello(){
        Session2 ss3 = new Session2();
        ss3.showInfo();
        //System.out.println("fullname: "+name);
        System.out.println("hello word!");
        System.out.println(abc);
    }
}
