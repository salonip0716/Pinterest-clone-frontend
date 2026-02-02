import java.util.*;

public class BTS
{
    public static void main(String args[])
    {    
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number :");
         int number =sc.nextInt();

         switch(number)
         {
            case 1: System.out.println("NAMJOON");
                   break;
            case 2: System.out.println("SOEKJIN");
                       break;
            case 3: System.out.println("YOONGI");
            break;
            case 4: System.out.println("HOSEAK");
            break;
            case 5: System.out.println("JIMIN");
            break;
            case 6: System.out.println("TAEHYUNG");
            break;
            case 7: System.out.println("JUNGKOOK");
            break;

            default: System.out.println("wake up");
         }
         sc.close();
    }
}
       