package T1904E.methoddemo;

public class caculator {
    public int add(int a,int b) {
        int tong = a + b;
        return tong;
    }

    public int add1(int a, int b, int c) {
        return a + b + c;
    }

    public int add2(int a, int b) {
        return a - b;
    }

    public int add3(int a, int b) {
        return a * b;
    }

    public int add4(int a, int b) {
        if (b != 0){
            return a/b;
        }
        return 0;
    }

    public static void main(String[] args ){
        caculator c = new caculator();
        int t = c.add(30, 40);
        System.out.println(t);
    }
}

