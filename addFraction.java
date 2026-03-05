//Bruteforce Approach
//package out.production.JAVADSA;
//
//import java.util.Scanner;
//
//public class addFraction {
//
//    static void addFractionBrute(int num1,int den1,int num2,int den2){
//
//        int numResult= (num1*den2)+(num2*den1);
//        int denResult= den1*den2;
//
//        for(int i=2; i<=Math.min(numResult,denResult);i++){
//                while (numResult%i==0&&denResult%i==0){
//                    numResult/=i;
//                    denResult/=i;
//                }
//        }
//        System.out.println(numResult+"/"+denResult);
//
//    }
//
//    static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter your first input: ");
//        int num1=scanner.nextInt();
//        System.out.println("Enter your second input: ");
//        int den1= scanner.nextInt();
//        System.out.println("Enter your third input: ");
//        int num2= scanner.nextInt();
//        System.out.println("Enter your fourth input: ");
//        int den2= scanner.nextInt();
//        addFractionBrute( num1,den1,num2,den2);
//    }
//}


//Optimal Approach
package out.production.JAVADSA;

import java.sql.SQLOutput;
import java.util.Scanner;

public class addFraction{
    static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    static void addFractionOptimal(int num1,int den1,int num2,int den2){
        int numResult=(num1*den2)+(num2*den1);
        int denResult=den1*den2;

        int g=gcd(numResult,denResult);

        numResult/=g;
        denResult/=g;
        System.out.println(numResult+"/"+denResult);
    }

    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your first input: ");
        int num1= scanner.nextInt();
        System.out.println("Enter your second input: ");
        int den1= scanner.nextInt();
        System.out.println("Enter your third input: ");
        int num2= scanner.nextInt();
        System.out.println("Enter your fourth input: ");
        int den2= scanner.nextInt();
        addFractionOptimal(num1,den1,num2,den2);
    }

}