import java.lang.reflect.Method;
import java.util.Scanner;
import javax.sql.rowset.spi.SyncResolver;


  
public class Salary {
    static int calcNbrDays(int wantedMoney){
        int days=0;
        int sum=1;
        
        while(sum<=wantedMoney){
            sum = sum * 2;
            days++;

        }
        return days;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wantedMoney = scan.nextInt();
        int nbrDays = calcNbrDays(wantedMoney);
        System.out.println(nbrDays);
    }

    // lägg till metoden calcNbrDays här
}
