// Part 8

import java.util.Scanner;

public class RandomPrint
{
    public static void main(String[] args)
    {
        int flag=0;
        char ch;
        char[] check={'r','a','n','d','o','m','R','A','N','D','O','M'};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        ch=sc.next().charAt(0);

        for (char c:check)
        {
            if (c == ch)
            {
                System.out.println("Found");
                flag=1;
                break;
            }
            else
                continue;
        }

        if(flag==0)
            System.out.println("Not Found");
    }
}
