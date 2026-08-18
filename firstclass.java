import java.util.*;

public class firstclass {
    public static void main(String[] args)  {
        // System.out.print("hello world"); the both line print the same line 
        // System.out.print("hello world");

        // to print line by line we use println


        // System.out.println("hello world");
        // System.out.println("hello world");

        // // to print in diff diff line we use /n

        // System.out.print("hello world\n");
        // System.out.print("hello world");


        //  print the pattern
    //    System.out.println("*");
    //    System.out.println("**");
    //    System.out.println("***");
    //    System.out.println("****");



    // variables in java

    // String name = "sachin";
    //  int a = 24;
    //  int b  = 10000; we can also change the value of variable

    // int a = 24;
    // int b = 10000;
    // int sum = a + b;
    //  System.out.println(sum);

    // input in java

    // Scanner sc= new Scanner(System.in); to take input from user we use scanner class by importing java.util package top of the code
    // String name = sc.nextLine();
   // System.out.println(name);

    // Scanner sc= new Scanner(System.in);

    // int a = sc.nextInt();   
    // int b =sc.nextInt();
    // int sum = a + b;
    // System.out.println(sum); // when we double quote then it print sum but when we remove double quote then it print the value of sum




    //  conditional statements in java

    // / if else statement

    // Scanner sc = new Scanner( System.in);
    // int x = sc.nextInt();
    // if (x>18){
    //     System.out.println("adult"); 

    // }else{
    //     System.out.println("not adult");

    // }

    // if (x%2==0){
        
    //     System.out.println("even");

    // }
    // else{
            
    //     System.out.println("odd");

    // }

    // swiched statetment in java


    Scanner sc = new Scanner( System.in);
    int button = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    switch (button) {
        case 1:
            System.out.println(a+b);
            break;
        case 2:
            System.out.println(a*b);
            break;
        default:
            System.out.println("Invalid input");
            break;
    }


    }
}