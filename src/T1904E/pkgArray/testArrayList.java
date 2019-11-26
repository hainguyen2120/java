package T1904E.pkgArray;

import java.util.ArrayList;
import java.util.Iterator;

public class testArrayList {
    ArrayList marks = new ArrayList();

    public void store(){
        marks.add(20);
        marks.add(12);
        marks.add(45);
        marks.add(46);
        marks.add(75);
        marks.add(23);
        marks.add(43);
        marks.add(17);
    }

    public void display() {
        // cach 1 la dung for
        for (int i = 0; i < marks.size();i++){
            int x = (int)marks.get(i);
            System.out.println(x);
        }

        //cach 2: dung iterator
        Iterator it = marks.iterator();
        while (it.hasNext()) {
            int x = (int)it.next();
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        testArrayList test = new testArrayList();
        test.store();
        test.display();
    }
}
