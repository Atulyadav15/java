// public class array {
//     public static void main(String[] args){
//         int [] marks = new int[3];
//         marks[0] = 97;
//         marks[1] = 98;
//         marks[2] = 95;
//         for(int i=0; i<3; i++){
//             System.out.println(marks[i]);
//         }
//     }
    
// }



// queastion like a linear search
// import java.util.*;
// public class array {
//     public static void main( String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt(); 
//         int [] numbers = new int[size];
//         // input
//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }
//         int x = sc.nextInt();

      
        
//         for( int i =0; i<numbers.length; i++){
            
//           if(numbers[i] == x){
//             System.out.println("x found at index : " + i);
//         }
//     }


//     }
// }






// find the maximam and minimum no in array

import java.util.*;

public class array{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] numbers = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;


        for(int i =0; i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
               

            }
             if(numbers[i]>max){
                    max=numbers[i];
                }

           
        }
         System.out.println("minimum value is : "+ min);
            System.out.println("maximum no in array is:"+ max);
    }
}


// import java.util.*;


// public class array {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//       int numbers[] = new int[size];


//       //input
//       for(int i=0; i<size; i++) {
//           numbers[i] = sc.nextInt();
//       }


//       int max = Integer.MIN_VALUE;
//       int min = Integer.MAX_VALUE;
     
//        for(int i=0; i<numbers.length; i++) {
//            if(numbers[i] < min) {
//                min = numbers[i];
//            }
//            if(numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//    System.out.println("Largest number is : " + max);
//        System.out.println("Smallest number is : " + min);
      
//    }
// }
