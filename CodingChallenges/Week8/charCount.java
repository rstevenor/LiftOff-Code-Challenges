package Week8;

public class charCount {
    public static int charCount(char c, String str) {
        int charCount = 0;
        for (int i = 0; i < str.length(); i++){
            char strChar = str.charAt(i);
            if(strChar == c){
                charCount ++;
            }
        }
        return charCount;

    }
}
