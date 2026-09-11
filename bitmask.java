// import java.util.*;
// public class bitmask {
//     public static void main(String[] args){
//          Scanner sc= new Scanner(System.in);
//          int opr = sc.nextInt();
//          int n= 5;
//          int pos= 1;
//          int bitmask = 1<<pos;
//          if(opr==1){
//           int newnumber = n| bitmask;
//           System.out.println(newnumber);
//          }

//          else{
//             int newbitmask =~(bitmask);
//             int newnumber = n & newbitmask;
//             System.out.println(newnumber);
//             sc.close();
//          }
//     }
// }

// Write a program to find if a number is a power of 2 or not.

import java.util.*;
public class bitmask {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         if((n & (n-1))==0){
            System.out.println("Yes");
         }
         else{
            System.out.println("No");
         }
         sc.close();
    }       
}