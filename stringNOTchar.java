import java.util.Scanner;

public class stringNOTchar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(onlyLetters(str));

    }
    /** Returns a string with only the letters in the string s. */
public static String onlyLetters(String s) {
    StringBuilder sb=new StringBuilder();
    for (int i=0; i<s.length(); i++) {
        char c=s.charAt(i);
        if (Character.isLetter(c)) {
            sb.append(c);
        }
    }
return sb.toString();
}
}
