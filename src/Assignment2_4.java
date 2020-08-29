// Part 4

import java.util.Scanner;

public class Four
{
    public static void main(String[] args)
    {
        int no;
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter a no: ");
            no=sc.nextInt();
            if(no>=0)
            {
                System.out.println("Good Going");
                continue;
            }
            else
            {
                System.out.println("Its Over");
                break;
            }

        }
    }
}
