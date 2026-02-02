package Loopallkind;
/*class Mains{
    public static void main(String args[])
    {
        System.out.println("Hello 2026 , here i am going to do the java practice since scratch. It's my zero to hero journey setup.");
    }
}*/

// we will code one program in which basics will cover.
import java.util.*;
class  Mains{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b =sc.nextInt();
        System.out.println("enter the operator you want:");
        System.out.println("1.Addition:");
        System.out.println("2.Subtraction:");
        System.out.println("3.multiplication:");
        System.out.println("4.division:");
        System.out.println("enter your choice:");
         int choice=sc.nextInt();
         int result;

         switch(choice)
         {
            case 1: 
                result =a+b;
            System.out.println("result " + result);  
            break;
             case 2: 
                result =a-b;
            System.out.println("result " + result);  
            break; 
            case 3: 
                result =a*b;
            System.out.println("result " + result);  
            break;
             case 4: 
                result =a/b;
            System.out.println("result " + result);  
            break;
            default:
            System.out.println("invalid operator");


         }
         sc.close();      
    }
 }

