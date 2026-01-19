import java.util.Scanner;
public class Code03 {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Boolean found=false;
        String result="";
        while(n>0){
             int digit=n%10;
            if(digit%2!=0){
             result=digit+" "+result;
            }
                         found=true;

                n=n/10;

            if(found){
                System.out.println(result.trim());
            }
            else{
                System.out.println(-1);
            }
    }
}
}