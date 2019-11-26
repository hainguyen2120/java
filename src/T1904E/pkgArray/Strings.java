package T1904E.pkgArray;

import java.util.Iterator;

public class Strings {
    String str = "Hello";
    Integer strLength = 5;

    public void displayStrings() {
        System.out.println("String length is: "+str.length());
        System.out.println("character ai index 2 it: "+str.charAt(2));
        System.out.println("concatenated string is: "+str.concat("World"));
        System.out.println("String comparison is: "+str.compareTo("World"));
        System.out.println("Index of o is: "+str.indexOf("o"));
        System.out.println("Last index of l is: "+str.lastIndexOf("l"));
        System.out.println();
    }
}
