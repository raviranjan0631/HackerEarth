import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int count1 = 0, count2 = 0;
        for(int i = 0; i < apples.length; i++){
            apples[i] += a;
            if(apples[i] >= s && apples[i] <= t){
                count1 += 1;
            }
        }
        for(int i = 0; i < oranges.length; i++){
            oranges[i] += b;
            
            if(oranges[i] >= s && oranges[i] <= t){
                count2 += 1;
            }
        }
        System.out.println(count1);
        
        System.out.println(count2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}

