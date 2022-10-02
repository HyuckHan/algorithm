import java.util.*;
import java.io.*;

public class Main3 {

				public static long calcSumDivisor(int n, long []M) {

								if(M[n] != 0) return M[n];
								if ( n == 1 ) return 1;

								long ret = 1 + n;

								for(int i = 2; i <= n/2; i++ ) {
												if ( n % i == 0 )
																ret = ret + i;
								}
								M[n] = ret;
								return M[n];
				}

				public static long calcSum(int n, long []M) {
								if(n==1) return 1;
								return calcSum(n-1,M) + calcSumDivisor(n,M);
				}

				public static void main(String[] args) throws NumberFormatException, IOException {
								BufferedReader bf;
								StringBuilder sb = new StringBuilder();
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

								long[] M = new long[max_num+1];
								for(int i=0; i<max_num+1;i++) 
												M[i] = 0;

								for(int i=0; i<nums;i++) { 
												long sum = calcSum(num_array[i],M); 
												sb.append(sum+"\n");
								}
								System.out.println(sb.toString());
				}
}
