
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner r = new Scanner(System.in);
            int amount = r.nextInt();
            int month = 3;
            for(int i=0; i< month; i++)
                amount = amount * 90/100;
            System.out.println(amount);
    }
}
