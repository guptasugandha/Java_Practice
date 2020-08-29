// Part 7

import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        float no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        no=sc.nextFloat();

        if(no==0)
            System.out.println("Zero");
        else
        {
            if (no < 0)
                System.out.println("Negative No");
            else
                System.out.println("Positive No");
        }

        if(Math.abs(no)<1)
            System.out.println("Small");
        else if(Math.abs(no)>1000000)
            System.out.println("Large");

    }
}
