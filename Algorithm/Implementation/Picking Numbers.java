import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int pickingNumbers(int[] a) {
        int count = 0;
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			}else{
				map.put(a[i], 1);
			}
			
		}
        for(int j : map.keySet()){
			int left=0, right =0;
			if(map.containsKey(j-1)){
				left += map.get(j-1) + map.get(j);
			}else {
				left = map.get(j);
			}
			if(map.containsKey(j+1)){
				right += map.get(j+1) + map.get(j);
			}else {
				right = map.get(j);
			}
			
			int sum = 0;
			sum = Math.max(left, right);
			if(sum > count){
				count = sum;
			}
		}
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
