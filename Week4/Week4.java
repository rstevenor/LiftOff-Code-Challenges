import java.util.*;
import java.io.*;

class Main {

    public static String LongestWord(String sen) {
        List<String> splitSen = List.of(sen.split(" "));
        int largest = 0;
        String longest = "";
        for (String st : splitSen){
            String noPun = removePunctuation(st);
            if (noPun.length() > largest){
                largest = noPun.length();
                longest = st;
            }
        }

        return longest;
    }

    public static String removePunctuation(String sen){
        String sanPun = "";
        for (Character c : sen.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sanPun += c;
            }
        }
        return sanPun;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}