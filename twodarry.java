// import java.util.*;

// public class twodarry {
//      public static void main (String[] args){
        
//         Scanner sc = new Scanner (System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();

//         int [][] numbers= new int[row][col];
//         // for iinput

//         for(int i =0; i<row; i++){
//             for( int j =0; j< col; j++){
//                 numbers[i][j] = sc.nextInt();

//             }
//         }
// // output
//         for(int i =0; i<row; i++){
//             for( int j =0; j< col; j++){
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//      }
    
// }


// find the x no in 2d array
import java.util.*;
public class twodarry {

public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();

    int [][] numbers= new int[row][col];
    // for iinput
    for(int i =0; i<row; i++){
        for( int j =0; j< col; j++){
            numbers[i][j] = sc.nextInt();

        }
    }
    int x = sc.nextInt();
    for(int i =0; i<row; i++){
        for( int j =0; j< col; j++){
            if(numbers[i][j] == x){
                System.out.println("x found at index : " + i + " " + j);
            }
        }sc.close();
    }


}
}
     