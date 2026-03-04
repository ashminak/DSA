// class Solution {
//     public int romanToDecimal(String s) {
//         // code here
//         Map<Character, Integer> map = new HashMap<>();

//         map.put('I',1);
//         map.put('V',5);
//         map.put('X',10);
//         map.put('L',50);
//         map.put('C',100);
//         map.put('D',500);
//         map.put('M',1000);
//         int ans=0;

//         for(int i=0;i<s.length();i++){
//             int curr=map.get(s.charAt(i));
//             if( i+1<s.length()){
//                 int prev=map.get(s.charAt(i+1));
//                  if(curr<prev){
//                 ans-=curr;
//             }else{
//                 ans+=curr;
//             }
//             }else{
//                 ans+=curr;
//             }


//         }
//         return ans;
//     }
// }


class Solution {
    public int romanToDecimal(String s) {
        // code here
        Map<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int prevnum=0;
        int ans=0;

        for(int i=s.length()-1;i>=0;i--){
            int num =map.get(s.charAt(i));
            if(num<prevnum){
                ans-=num;
            }else{
                ans+=num;
            }
            prevnum=num;
        }
        return ans;


    }
}
//### Both Approaches
//```
//Time: O(n)
//Why?
//We go through string ONCE
//        n = length of string
//
//Space: O(1)
//Why?
//Map has only 7 entries
//Always fixed size!
//Never grows!
//So constant space!