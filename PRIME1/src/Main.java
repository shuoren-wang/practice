/*
* Peter wants to generate some prime numbers for his cryptosystem. Help him! Your task is to generate all prime numbers between two given numbers!

Input

The input begins with the number t of test cases in a single line (t<=10). In each of the next t lines there are two numbers m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.

Output

For every test case print all prime numbers p such that m <= p <= n, one number per line, test cases separated by an empty line.
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

            int start, end;
            start=input.nextInt();
            end=input.nextInt();

            mn.printPrime(start,end);

            System.out.println();
        }
    }

    private void printPrime(int m, int n){
        for (int i=m ; i<= n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int i){
        if(i<2){
            return false;
        }
        if(i==2){
            return true;
        }
        if(i%2==0){
            return false;
        }
        return isPrime(i,3);
    }

    private boolean isPrime(int n, int divisor){
        if(divisor*divisor>n){
            return true;
        }

        if((n%divisor)==0){
            return false;
        }
        return isPrime(n,divisor+2);
    }
}
