import java.util.Scanner;

public class GcdAndLcm {
    static long gcdopti(long a, long b){
        if(b==0)return a;
        return gcdopti(b,a%b);
    }
    static long lcmopti(long a, long b){
        long gcd=gcdopti(a,b);
        return (a*b/gcd);
    }

    static long[]gcdAndlcm(long a ,long b){
        return new long[]{gcdopti(a,b),lcmopti(a,b)};
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first input: ");
        long a = scanner.nextLong();
        System.out.println("Enter your second input: ");
        long b = scanner.nextLong();
        long[] result = gcdAndlcm(a,b);
        System.out.println(result[0]+" "+result[1]);
    }
}
