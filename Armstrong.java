import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        int start = obj.nextInt();
        int end= obj.nextInt();
        Boolean found=false;
        for(int n=start;n<=end;n++){
            
   
        int temp=n;
        int count=0;
        int sum=0;
        int digit;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=n;
        while(temp>0){
            digit=temp%10;
            sum=sum+(int)Math.pow(digit,count);
            temp=temp/10;
        }
        if(sum==n){
            System.out.print(n+" ");
            found=true;
        }
}
        if(!found){
            System.out.print("No elements");
        }
    }
}

