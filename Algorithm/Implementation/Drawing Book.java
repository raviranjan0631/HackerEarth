import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        int page = 1, count1 = 0, count2 = 0;
        while(page < p){
            page += 2; 
            count1 += 1;
        }
        page = n;
        if(page % 2 != 0){
            page -= 1;
        }
        while(p < page){
            page -= 2;
            count2 += 1;
        }
        return Math.min(count1, count2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
