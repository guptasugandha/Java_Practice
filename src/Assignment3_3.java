// Part 3

import java.util.Scanner;
public class Assign3
{
    public static void main(String[] args)
    {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        no=sc.nextInt();

        switch(no)
        {
            case 1:
                System.out.println("In January there are 31 days");
                break;
            case 2:
                System.out.println("In February there are 28/29 days");
                break;
            case 3:
                System.out.println("In March there are 31 days");
                break;
            case 4:
                System.out.println("In April there are 30 days");
                break;
            case 5:
                System.out.println("In May there are 31 days");
                break;
            case 6:
                System.out.println("In June there are 30 days");
                break;
            case 7:
                System.out.println("In July there are 31 days");
                break;
            case 8:
                System.out.println("In Aug there are 31 days");
                break;
            case 9:
                System.out.println("In September there are 30 days");
                break;
            case 10:
                System.out.println("In October there are 31 days");
                break;
            case 11:
                System.out.println("In November there are 30 days");
                break;
            case 12:
                System.out.println("In December there are 31 days");
                break;
            default:
                System.out.println("Invalid No");
                break;
        }

    }
}
