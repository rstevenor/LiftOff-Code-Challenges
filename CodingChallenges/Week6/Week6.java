package Week6;

import static java.lang.Character.toLowerCase;

public class Week6 {

    public static void main(String[] args){
        System.out.print(detectWord("YFemHUFBbezFBYzFBYLleGBYEFGBMENTment"));
    }

    public static String detectWord(String str) {
        String word = "";

        for(int i = 0; i < str.length(); i++ ) {
            char[] charArray = str.toCharArray();
            char l = charArray[i];
            if (toLowerCase(l) == l) {
                word += l;
            }
        }

        return word;
    }
}
