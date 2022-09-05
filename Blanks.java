import java.util.Scanner;
// Funkar inte med inläsningen

public class Blanks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String ord=scan.next();
        System.out.println(nbrBlanks(ord));
    }
         
    public static int nbrBlanks(String s){
        int mellanslag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                mellanslag++;
            }
        }
        return mellanslag;

    }

    
}
