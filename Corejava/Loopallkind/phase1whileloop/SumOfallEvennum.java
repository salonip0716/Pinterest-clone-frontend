import java.util.*;

public class SumOfallEvennum {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            if(i%2==0){
                sum=sum+i;
                
            }i++;
        }System.out.println(sum);
        sc.close();
    }

    
}
