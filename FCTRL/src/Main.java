/*
*  For any positive integer N, Z(N) is the number of zeros at the end of the decimal form of number N!. They noticed that this function never decreases. If we have two numbers N1<N2, then Z(N1) <= Z(N2). It is because we can never "lose" any trailing zero by multiplying by any positive number. We can only get new and new zeros. The function Z is very interesting, so we need a computer program that can determine its value efficiently.

Input

There is a single positive integer T on the first line of input (equal to about 100000). It stands for the number of numbers to follow. Then there are T lines, each containing exactly one positive integer number N, 1 <= N <= 1000000000.

Output

For every number N, output a single line containing the single non-negative integer Z(N).

*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Main mn=new Main();
        Scanner input=new Scanner(System.in);

        int cases=input.nextInt();

        while(cases!=0){
            cases--;
            int n=input.nextInt();
            mn.FactorialTrailingZero(n);
        }
    }

    //number of zeros = n/5+n/25+...n/m , m=5^i & m < n (i is Positive number)
    private void FactorialTrailingZero(int n){
        int i=0;
        int m=5;

        while (m<=n){
            i+=n/m;
            m*=5;
        }

        System.out.println(i);
    }

}
