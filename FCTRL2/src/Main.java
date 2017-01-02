import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main mn=new Main();
        int cases;
        Scanner input=new Scanner(System.in);

        cases=input.nextInt();

        while(cases!=0){
            int n;
            n=input.nextInt();

            mn.printFactorial(n);

            cases--;
        }
    }

    private void printFactorial(int n){


        BigInteger temp=BigInteger.ONE;
        while (n>0){
            temp=temp.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(temp);
    }


}
