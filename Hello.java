import java.util.*;
import java.math.BigInteger; 
public class Hello{
    public static void main(String args[]){
        int fristnum;
        BigInteger fact = BigInteger.ONE;
        int counter;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        fristnum = sc.nextInt();
        counter = fristnum;
        while(counter >= 1)
        {
            fact = fact.multiply(BigInteger.valueOf(counter));
            counter--;
        }
        System.out.println(fact);        
    }
}
