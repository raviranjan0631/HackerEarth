import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int formingMagicSquare(int[][] s) {
        // Complete this function
        int arrState[][] = { {8,1,6,3,5,7,4,9,2},{6,1,8,7,5,3,2,9,4},{4,9,2,3,5,7,8,1,6},{2,9,4,7,5,3,6,1,8}
                       ,{8,3,4,1,5,9,6,7,2},{6,7,2,1,5,9,8,3,4},{4,3,8,9,5,1,2,7,6},{2,7,6,9,5,1,4,3,8} };
        int arr[] = new int[9];
        int k = 0, diff = Integer.MAX_VALUE, count = 0, count1 = 0, small = Integer.MAX_VALUE ;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[k] = s[i][j];
                k++;
            }   
        }
        k = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 9; j++){
                int sum = arr[j] - arrState[i][j];

                if(sum < 0){
                    sum *= -1;
                }
                k += sum;
                
            }
            if(k < diff){
            	diff = k;
            }
            k =0;
        }
        return diff;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}

