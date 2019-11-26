package T1904E.arraydemo;

public class testArrayString {
    String[] isEmpcode = new String[5];

    public void store(){
        for(int i = 0; i < isEmpcode.length; i++){
            isEmpcode[i] = "E000"+i;
        }
    }
    public void show(){
        for( int i =0; i < isEmpcode.length;i++){
            System.out.println(isEmpcode[i]);
        }
    }

    public static void main(String[] args){
        testArrayString test = new testArrayString();
        test.store();
        test.show();
    }
}
