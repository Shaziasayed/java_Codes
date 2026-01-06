import java.util.Scanner;

public class DaysinMonth {
     public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
            if(n==4 ||n==6 ||n==9||n==11){
                System.out.println(30);
            }
            else if(n==2){
                 System.out.println(28);
               
            }
           
            else if (n<1 ||n>12){
                System.out.println("Error");

            }
             else {
                System.out.println(31);
             }
        
    }
}

