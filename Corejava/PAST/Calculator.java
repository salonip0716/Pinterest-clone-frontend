import java.util.Scanner;

public class Calculator{
   
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
        
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println("choose opertor:");
        char oprtor=sc.next().charAt(0);
        
        
        
        switch(oprtor)
        { 
            case '+': System.out.println("the sum of a and b : " +(a+b));
            break;
            case '-': System.out.println("the sum of a and b : " +(a-b));
            break;
            case '*': System.out.println("the sum of a and b : " +(a*b));
            break;
            case '/': System.out.println("the sum of a and b : " +(a/b));
            break;
            case '%': System.out.println("the modulus of a and b : " +(a%b));
            break;
            default:System.out.println("wrong operator");
        }
        sc.close();
    }

        
      
    }


