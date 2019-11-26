package T1904E.arraydemo;

public class twoDimesion {
    float[][] marks = new float[3][2];

    public void store() {
        marks[0][0] = 10;
        marks[0][1] = 8;

        marks[1][0] = 7;
        marks[1][1] = 6;

        marks[2][0] = 9;
        marks[2][1] = 7;
    }

    public void show() {
        for (int i = 0; i < marks.length; i++){
            float[] tmp = marks[i];
            for (int j = 0; j < tmp.length; j++){
                System.out.println(tmp[j] +"   "); // tuong duong marks[i][j]
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        twoDimesion t = new twoDimesion();
        t.store();
        t.show();
    }
}
