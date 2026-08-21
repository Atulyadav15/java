// import java.util.*;
public class loops {
     public static void main(String[] args) {
       
        // for looop in java
         // for loop
          
        //  for(int i =0; i<10;i++){
        //     System.out.println(i);
        //  }

        // while loop
        // int i = 0;
        // while( i<11){
        //     System.out.println(i);
        //     i++;

        // }
//         int i = 0;
//         do{
//             System.out.println(i);
//             i++;
//         } while(i<10);

// sum of natural numbers using for loop
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sum =0;
// for(int i = 1; i<=n; i++){
//     sum = sum+i;
// }
// System.out.println(sum);


// multiplication table using for loop
// Scanner sc =new Scanner(System.in);
// int n = sc.nextInt();
// for(int i = 1; i<=10; i++){
//     System.out.println(n*i);
// }



// print the pattern using for loop
// ****
// ****
// ****
// ****

//nested loops in java

// for(int i = 1; i<=4; i++){
//     for(int j=1; j<=4;j++){
//         System.out.print("*");
//     }
//     System.out.println();

// }

// *****.   pattern printing
// *   *
// *   *
// *****
// int n = 4;
// int m= 5;
// for( int i=1; i<=n; i++){    outer loop for rows
//     for(int j=1; j<=m; j++){  inner loop for columns

//         if(i==1 || i==n|| j==1 || j==m){    cell loop
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
        
//     }
//     System.out.println();
// }


// *.      1
// **.      1 2
// ***.     1 2 3
// ****.    1 2 3 4

// int n = 4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(j+" ");    // put j instead of * to print numbers 
//     }
//     System.out.println();
// }


// ****   1 2 3 4 
// ***    1 2 3 
// **   1  2
// *   1 



// int n = 4;
// for(int i=n; i>=1; i--){
//     for(int j=1; j<=i; j++){
//         // System.out.print(j+" ");    // put j instead of * to print numbers 
//     }
//     System.out.println();
// }



//    *
//   **
//  ***
// ****
// int n = 4;
// for(int i=1; i<=n; i++){
//     // inner loop for spaces
//     for(int j =1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     // inner loop for stars
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }



// floide triangle pattern
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 

// int n = 4;
// int number=1;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(number+" ");    // put j instead of * to print numbers 
//         number++;
//     }
//     System.out.println();
// }

int n = 5;

for(int i=1; i<=n; i++){
  for( int j=1;j<=i;j++){

    int sum= i +j;
    if(sum %2 ==0){
        System.out.print("1"+" ");
    }
    else{
        System.out.print("0"+" ");
    }
}
System.out.println();

}
  }
}
