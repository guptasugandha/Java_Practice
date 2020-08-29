// Part 6

import java.util.Scanner;

public class NewOld
{
    public static void main(String[] args)
    {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        no=sc.nextInt();

        if(no%2!=0)
            System.out.println("NEW");
        else
        {
            if(no>=2 && no<=5)
                System.out.println("OLD");
            else
            {
                if(no>=6 && no<=30)
                    System.out.println("NEW");
                else
                    System.out.println("OLD");
            }
        }


    }
}
