package lab_5;

public class TamGiacVuong extends TamGiac{
    public TamGiacVuong(int canh1, int canh2, int canh3) {
        super(canh1, canh2, canh3);
        if(!this.checkTamgiacVuong() ){
            System.out.println("day khong phai tam giac vuong");
        }
    }

    public boolean checkTamgiacVuong(){
        int max = Math.max(Math.max(getCanh1(),getCanh2()),getCanh3());
        return canh1 * canh1 + canh2 * canh2 + canh3 * canh3 == max * max * 2;
    }
}
