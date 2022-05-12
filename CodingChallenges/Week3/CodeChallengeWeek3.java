package Week3;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

class Main {

    public static String FirstReverse(String str) {
        String newStr ="";
        for(int i = 0; i < str.length(); i++){
             newStr = str.charAt(i) + newStr;
        }
        return newStr ;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}