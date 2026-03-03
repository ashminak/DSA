//import java.util.Scanner;
////Bruteforce Approach
//public class factorialOfEachDigit {
//
//    // calculate factorial of single digit
//    static long digitFactorial(int digit){
//        long fact=1;
//        for(int i=2;i<=digit;i++){
//            fact*=i;
//        }
//        return fact;
//    }
//
//    //main function
//    static long factorialOfdigit(int n){
//        long result=1;
//       while (n>0){
//          int  digit = n%10;
//          result *= digitFactorial(digit);
//          n/=10;
//
//       }
//       return result;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println(factorialOfdigit(n));
//    }
//}



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//OPTIMAL APPROACH - IN BRUTEFORECE EACH DIGIT FACTORIAL CALCUTALTING EVERYRING TIME HERE WILL PRE CALCULATE AND STORE IT IN AND ARRAY AND WHEN NEEDED JUST LOOKUP ON THAT FACTORIAL WITHOUT CALCULATING IT

public class factorialOfEachDigit {



    //main function
    static long factorialOfdigit(int n){

        long [] fact= new long[10];
          fact [0]=1;
        for(int i=0;i<=9;i++){
            fact[i]=fact[i-1]*i;
        }
        long result=1;
        while (n>0){
            int  digit = n%10;
            result *= fact[digit];
            n/=10;

        }
        return result;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorialOfdigit(n));
    }
}
