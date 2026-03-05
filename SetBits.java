package out.production.JAVADSA;

import java.util.Scanner;

public class SetBits {
    static int countSetBits(int n){
        if(n==0)return 0;
        int x=0;
        while((1<<x)<=n){
            x++;
        }
        x--;

        int part1= x*(1<<(x-1));
        int part2=n-(1<<x)+1;
        int part3=countSetBits(n-(1<<x));
        int total = part1+part2+part3;
        return total;
    }

    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your input: ");
        int n = scanner.nextInt();
        System.out.println("Answer is "+countSetBits(n)+".");
    }
}
