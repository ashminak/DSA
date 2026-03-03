//Bruteforce approch
//public class ArithmenthicNumber {
//     public static int intSequence(int a, int b, int c){
//        if(c==0){
//            return a==b?1:0;
//        }
//
//        for(int i=a;i<=b;i+=c){
//            if(i==b){
//                return 1;
//            }
//        }
//        return 0;
//    }
//}

//Optimal Approach

public class Arithmetic{
    static int inSequence(int a, int b, int c){
        if(a==b&&c==0) return 1;
        int diff = b-a;
        if(c!=0&&diff%c==0&&diff/c>=0){
            return 1;
        }
        return 0;
    }
}
