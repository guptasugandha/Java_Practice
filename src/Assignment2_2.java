// Part 2:

import java.util.*;
public class Calculator {
    public static void main(String[] args){
        System.out.println("Choose 1 for Addition, 2 for Subtraction, 3 for Division, 4 for multiplication and 5 for average");
        Scanner myObj = new Scanner(System.in);
        int a;
        a = myObj.nextInt();

        switch (a){
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                division();
                break;
            case 4:
                multi();
                break;
            case 5:
                avg();
                break;
            default:
                break;
        }
        myObj.close();

    }

    public static void addition(){
        int a,b,c;
        System.out.println("Enter two numbers");
        Scanner myObj1 = new Scanner(System.in);
        a = myObj1.nextInt();

        Scanner myObj2 = new Scanner(System.in);
        b = myObj2.nextInt();
        c = a+b;
        System.out.println("Sum: " + c);
        if(c<0){
            System.out.println("Oops option 1 is returning the negative number.");
        }
        myObj1.close();
        myObj2.close();

    }

    public static void subtraction(){
        int a,b,c;
        System.out.println("Enter two numbers: larger and then smaller");
        Scanner myObj1 = new Scanner(System.in);
        a = myObj1.nextInt();
        Scanner myObj2 = new Scanner(System.in);
        b = myObj2.nextInt();
        myObj1.close();
        myObj2.close();
        c = a-b;
        System.out.println("Diff: " + c);
        if(c<0){
            System.out.println("Oops option 2 is returning the negative number.");
        }
    }


    public static void division(){
        int a,b;
        float c;
        System.out.println("Enter two numbers (non-zero)");
        Scanner myObj1 = new Scanner(System.in);
        a = myObj1.nextInt();
        Scanner myObj2 = new Scanner(System.in);
        b = myObj2.nextInt();
        myObj1.close();
        myObj2.close();
        c = a/b;
        System.out.println("Div: " + c);
        if(c<0){
            System.out.println("Oops option 3 is returning the negative number.");
        }
    }


    public static void multi(){
        int a, b,c;
        System.out.println("Enter two numbers");
        Scanner myObj1 = new Scanner(System.in);
        a = myObj1.nextInt();
        Scanner myObj2 = new Scanner(System.in);
        b = myObj2.nextInt();
        myObj1.close();
        myObj2.close();
        c = a*b;
        System.out.println("Product: " + c);
        if(c<0){
            System.out.println("Oops option 4 is returning the negative number.");
        }
    }


    public static void avg(){
        int n, aver, b;
        System.out.println("Enter the number of elements");
        Scanner myObj1 = new Scanner(System.in);
        n = myObj1.nextInt();
        int sum = 0;
        for(int i = 0; i<n; i++){
            Scanner myObj2 = new Scanner(System.in);
            b = myObj2.nextInt();

            sum += b;
        }
        aver = sum/n;
        System.out.println("Avg: " + aver);
        if(aver<0){
            System.out.println("Oops option 5 is returning the negative number.");
        }

        myObj1.close();
    }
}
