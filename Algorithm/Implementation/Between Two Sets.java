package Implementation;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
    	int min = 101, max = 0;
    	for (int i = 0; i < a.length; i++) {
			if(a[i] > max){
				max = a[i];
			}
		}
    	for (int i = 0; i < b.length; i++) {
			if(b[i] < min){
				min = b[i];
			}
		}
    	int count = 0;
    	for(int i = max; i <= min; i++ ){
    		boolean flag1 = true, flag2 = true;
    		for (int j = 0; j < a.length; j++) {
				if(i % a[j] != 0){
					flag1 = false;
					break;
				}
			}
    		for (int j = 0; j < b.length; j++) {
				if(b[j] % i != 0){
					flag2 = false;
					break;
				}
			}
    		if(flag1 && flag2){
    			count++;
    		}
    	}
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
