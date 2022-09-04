import java.util.Scanner;

public class CalcFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));
    }
    
        static int factorial(int n){
            int nuvarande=1;
            int i=1;
            while(i<= n){
                nuvarande=nuvarande*i;
                i++;

            }
            return nuvarande;

    } // lägg till metoden factorial här
    
}