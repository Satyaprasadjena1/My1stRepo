public class Hello{
    public static void main(String args[]){
        int fristnum;
        int fact = 1;
        int counter;
        System.out.println("enter a number");
        Scanner sc = new Scanner();
        fristnum = sc.nextInt();
        counter = fristnum;
        while (counter >= 1)
        {
            fact = fact*1;
            counter--;
        }
        System.out.println(fact);        
    }
}
