import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main mn=new Main();
        int cases;
        Scanner input=new Scanner(System.in);

        cases=input.nextInt();

        while(cases!=0){
            int i,j;
            i=mn.delZero(input.nextInt());
            j=mn.delZero(input.nextInt());

            int sum= mn.reverseSum(i,j);

            System.out.println(sum);

            cases--;
        }
    }

    private int reverseSum(int i, int j){
        i=reverseNum(i);
        j=reverseNum(j);

        return delZero(reverseNum(i+j));
    }

    private int delZero(int n){
        while (n%10==0){
            n=n/10;
        }

        return n;
    }

    private int reverseNum(int n){
        int m=0;
        int i=0;
        int temp=n;

        while (temp>=10){
            temp=temp/10;
            i++;
        }

        while (n!=0){
            temp=n%10;
            m+=temp*(Math.pow(10,i));

            n=n/10;
            i--;
        }

        return m;
    }
}