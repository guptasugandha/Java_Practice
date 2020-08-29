// Part 3

public class FlowChart
{
    public static void main(String[] args)
    {
        int a=10,b=20,c=30;
        int avg=(a+b+c)/3;
        System.out.println("Average is : "+avg);
        if(avg>a)
        {
            if(avg>b)
            {
                if(avg>c)
                {
                    System.out.println("Average is higher than a,b,c");
                }
                else
                    System.out.println("Average is higher than a,b");
            }
            else
            {
                if(avg>c)
                {
                    System.out.println("Average is higher than a,c");
                }
                else
                    System.out.println("Average is higher than a");

            }
        }
        else
        {
            if(avg>b)
            {
                if(avg>c)
                {
                    System.out.println("Average is higher than b,c");
                }
                else
                    System.out.println("Average is higher than b");
            }
            else
            {
                if(avg>c)
                {
                    System.out.println("Average is higher than c");
                }
            }

        }
    }
}
