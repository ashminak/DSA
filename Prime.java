//package out.production.JAVADSA;
//
//import java.util.Scanner;
//
//public class Prime {
//    static int primeNumber(int n){
//        if(n<=1)return 0;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                return 0;
//            }
//        }
//        return 1;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your input: ");
//        int n = scanner.nextInt();
//        System.out.println(primeNumber(n));
//    }
//}


import java.util.Scanner;

public class Prime {
    static int primeNumber(int n){
        if(n<=1)return 0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your input: ");
        int n = scanner.nextInt();
        System.out.println(primeNumber(n));
    }
}
