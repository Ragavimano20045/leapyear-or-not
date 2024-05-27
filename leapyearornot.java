import java.util.*;
public class leapyearornot 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%400==0)
        {
            System.out.println("Leap Year");
        }
        else if(a%4==0&&a%100!=0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not leap year");
        }
        sc.close();
    }
}
