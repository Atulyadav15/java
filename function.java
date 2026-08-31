// import java.util.*;
// public class function {
//     // public static void printHello(String name){
//     //     System.out.println(name);
//     //     return;

//     // public static int calculatesum(int a , int b){
//     //     // int sum = a + b;
//     //     return sum;
//     // }
//     //   public static int calculateproduct(int a , int b){
//         // return a*b;
//     //   }

//     public static void fictorial( int n){
//         if( n<0){
//             System.out.println("invalid input");
//         }

//         int fictorial=1;

//         for(int i=n; i>=1; i--){
//             fictorial = fictorial * i;
//         }
//         System.out.println(fictorial);
//         return;
//     }

//     public static void main(String[] args) {  
//         Scanner sc = new Scanner(System.in);
//         // String name = sc.next();
//         // printHello(name);



// // calculate sum
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         // int sum = calculatesum(a,b);
//         // System.out.println(sum);


//         // function in java
//         // function is a block of code which is used to perform a specific task
//         // function is also called method in java
//         // function is used to avoid the repetition of code
//         // function is used to make the code more readable and maintainable

//         // syntax of function in java
//         // return_type function_name(parameters){
//         //     // body of the function
//         // }

//         // example of function in java
        
//         // calculate multipli

//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         // int product = calculateproduct(a,b);
//         // System.out.println(product);

//         int n = sc.nextInt();
//         fictorial(n);





//     }
   
//     }



import java.util.*;
public class function
{
    public static int avg( int a, int b, int c){
        return (a+b+c)/ 3;
    
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(avg(a, b, c));
    }


}





