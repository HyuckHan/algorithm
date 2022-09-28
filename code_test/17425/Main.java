import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf;
		StringBuilder sb = new StringBuilder();
		long v[];
		long sum[];
		int nums;
		int num_array[];
		int max_num;

		bf = new BufferedReader(new InputStreamReader(System.in));
		nums = Integer.parseInt(bf.readLine());
		num_array = new int[nums];
		for(int i=0; i<nums;i++) {
			num_array[i] = Integer.parseInt(bf.readLine());
		}

		max_num = num_array[0];
		for(int i=1; i<nums;i++) {
			if( max_num < num_array[i] )
				max_num = num_array[i];
		}

		v = new long[max_num+1];
		sum = new long[max_num+1];

		for(int i = 1; i <= max_num; i++) { 
			v[i] = 1;
		}
		
		for(int i = 2; i <= max_num; i++) { 
			for(int j = 1; j*i <= max_num; j++) { 
				v[j*i] += i; 
			}
		}
		
		for(int i = 1; i <= max_num; i++){
			sum[i] = sum[i-1] + v[i]; 
		}
		
		for(int i=0; i<nums;i++) {
			sb.append(sum[num_array[i]] +"\n");
		}
		System.out.println(sb.toString());
	}
}
