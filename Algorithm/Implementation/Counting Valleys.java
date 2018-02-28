import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countingValleys(int n, String s) {
        // Complete this function
        int sum = 0, count = 0, sum1 = 0;
        char start = s.charAt(0);
        if(start == 'D'){
            sum = -1;
        } else {
            sum1 = 1; 
        }
        for(int i = 1; i < s.length(); i++){
            if(sum == 0 && sum1 == 0){
                start = s.charAt(i);
            }
            if(start == 'D'){
                if(s.charAt(i) == 'U'){
                    sum += 1;
                } else {
                    sum -= 1;
                }
                
            } 
            if(start == 'U'){
                if(s.charAt(i) == 'U'){
                    sum1 += 1;
                } else {
                    sum1 -= 1;
                }
                
            }
            if(sum == 0 && start == 'D'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
