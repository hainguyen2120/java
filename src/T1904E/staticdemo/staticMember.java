package T1904E.staticdemo;

public class staticMember {
    public static int staticCounter = 0;
    public int instaceCounter  = 0;

    public static void setStaticMethod() {
        System.out.println("this is static method");
    }

    public void displayCounter() {
        staticCounter++;
        instaceCounter++;
        System.out.println("staticCounter = "+staticCounter);
        System.out.println("instanceCounter = "+instaceCounter);
    }

    public static void main(String[] args) {
        System.out.println("staticMember.staticCounter = "+staticMember.staticCounter);
        staticMember.setStaticMethod();

        staticMember s1 = new staticMember();
        s1.displayCounter();

        staticMember s2 = new staticMember();
        s2.displayCounter();
    }
}
