//Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;

public class Practice01 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if(number > 0)
        {
            System.out.println("The number is positive");
        }
        else if(number < 0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is zero");
        }
    sc.close();
    }
    
}
