package lab_5;

public class TamGiacDeu extends TamGiacCan {
    public TamGiacDeu(int canh1, int canh2, int canh3){
        super(canh1, canh2, canh3);
        if(!checkTamGiacDeu()){
            System.out.println("day khong phai tam giac deu");
        }
    }
    public boolean checkTamGiacDeu(){
        return getCanh1() == getCanh2() && getCanh2() == getCanh3();
    }
}
