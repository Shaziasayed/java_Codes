 import java.util.*;
// public class Recfac {
//     int factorial(int n) {
//         if (n == 0) {
//             return 1;
//         }
//         return n * factorial(n - 1);
//     }
//     public static void main(String args[]) {
//         // Recfac rf = new Recfac();
//         // int num = 7;
//         // int result = rf.factorial(num);
//         // System.out.println( result);
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int num = sc.nextInt();
//         Recfac rf = new Recfac();   
//         int result = rf.factorial(num);
//         System.out.println( result);
//     }
// }

public class Recfac{
    // int sum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     return n+sum(n-1);
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner (System.in);
    //     System.out.print("Enter number: ");
    //     int num=sc.nextInt();
    //     Recfac rf=new Recfac();
    //     int result=rf.sum(num);
    //     System.out.println(result);

    //}
    // int fib(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     if(n==1){
    //         return 1;
    //     }
    //     return fib(n-1)+fib(n-2);
    // }
    // public static void main(String args[]){
    //     Scanner sc =new Scanner (System.in);
    //     System.out.print("Enter number: ");
    //     int num=sc.nextInt();
    //     Recfac rf=new Recfac();
    //     int result=rf.fib(num);
    //     System.out.println(result);

   // }
//    int countDigits(int n){
//     if(n==0){
//         return 0;
//     }
//     return 1+countDigits(n/10);
//    }
//     public static void main(String args[]){
//      Scanner sc=new Scanner (System.in);
//      System.out.print("Enter number: ");
//      int num=sc.nextInt();
//      Recfac rf=new Recfac();
//      int result=rf.countDigits(num);
//      System.out.println(result);
//     }
    // int sumDigits(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return (n%10)+sumDigits(n/10);
    // }
    // public static void main(String args[]){
    //  Scanner sc=new Scanner (System.in);
    //  System.out.print("Enter number: ");
    //  int num=sc.nextInt();
    //  Recfac rf=new Recfac();
    //  int result=rf.sumDigits(num);
    //  System.out.println(result);
    // }
    // String ReverseString(String str){
    //    if(str.length()==0)
    //     return str;
    //     return ReverseString(str.substring(1))+str.charAt(0);
    // }

    // public static void main(String args[]){
    //  Scanner sc=new Scanner (System.in);
    //  System.out.print("Enter string: ");
    //  String str=sc.nextLine();
    //  Recfac rf=new Recfac();
    //  String result=rf.ReverseString(str);
    //  System.out.println(result);
    // }
    // String Palindrome(String str){
    //     if(str.length()<=1){
    //         return str;
    //     }
    //     return Palindrome(str.substring(1))+str.charAt(0);
    // }
    // public static void main(String args[]){
    //  Scanner sc=new Scanner (System.in);
    //  System.out.print("Enter string: ");
    //  String str=sc.nextLine();
    //  Recfac rf=new Recfac();
    //  String result=rf.Palindrome(str);
    //  if(str.equals(result)){
    //     System.out.println("palindrome");
    //  }else{
    //     System.out.println("not palindrome");
    //  }
    // }
   
   public static boolean ispalindrome(String str, int strat, int end){
    if(strat>=end){
        return true;
    }
    if(str.charAt(strat)!=str.charAt(end)){
        return false;
    }
    return ispalindrome(str, strat+1, end-1);
    
   }
    public static void main(String args[]){
     Scanner sc=new Scanner (System.in);
     System.out.print("Enter string: ");
     String str=sc.nextLine();
     boolean result=ispalindrome(str,0,str.length()-1);
     if(result){
          System.out.println("palindrome");
     }else{
          System.out.println("not palindrome");
     }
    }
    public int climb(int n){
        int prev2=1;
        int prev1=1;
        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public static void main(String args[]){
     Scanner sc=new Scanner (System.in);
     System.out.print("Enter number: ");
     int num=sc.nextInt();
     Recfac rf=new Recfac();
     int result=rf.climb(num);
     System.out.println(result);
    }
    public int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpow=pow(x,n/2);
        int halfpowsquare=halfpow*halfpow;
        if(n%2!=0){
            halfpowsquare=x*halfpowsquare;
        }
        return halfpowsquare;
    }
}
