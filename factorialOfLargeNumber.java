import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class factorialOfLargeNumber{
    //Bruteforce Approach
   public   static ArrayList<Integer> factorial(int N){
        BigInteger result = BigInteger.ONE;

        for(int i=2; i<=N;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        String number = result.toString();
        ArrayList<Integer> ans= new ArrayList<>();
        for(char c:number.toCharArray()){
            ans.add(c - '0');
        }
        return  ans;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();

         ArrayList<Integer> result = factorial(N);
         for (int digit:result){
             System.out.print(digit);
         }

    }



}
