import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int index = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n ;i++){
            arr[i] = scn.nextInt();
        }
        int charged = scn.nextInt();
        int actual = 0;
        for(int i = 0; i < n ;i++){
            if(i != index){
                actual += arr[i];
            }
        }
        actual /= 2;
        if(actual == charged){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(charged - actual);
        }
    }
}

