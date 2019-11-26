package lab_5;

public class TamGiacCan extends TamGiac {
    public TamGiacCan(int canh1, int canh2, int canh3) {
        super(canh1, canh2, canh3);
        if(!checkTamgiacCan()){
            System.out.println("day khong phai tam giac can");
        }
    }

    public boolean checkTamgiacCan(){
        return getCanh1() == getCanh2() || getCanh2() == getCanh3()
                || getCanh1() == getCanh3();
    }
}
