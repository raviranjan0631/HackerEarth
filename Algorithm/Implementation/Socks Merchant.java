import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
        	if(map.containsKey(ar[i])){
        		map.put(ar[i], map.get(ar[i]) + 1);
        	}else {
        		map.put(ar[i], 1);
        	}
        }
        Collection<Integer> keys = map.values();
        for( Integer i : keys){
            if(i >= 2 ){
                count += i/2;
                
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
