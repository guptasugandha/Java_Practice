// Part 5

public class PrintNums
{
    public static void main(String[] args)
    {
        for(int i=0;i<7;i++)
        {
            if(i==3 || i==6)
                continue;
            else
                System.out.print(" "+i);
        }

    }
}
