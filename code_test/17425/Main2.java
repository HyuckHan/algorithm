import java.util.*;
import java.io.*;

public class Main2 {

				public static long calcSumDivisor(int n) {
								if ( n == 1 ) return 1;
								long ret = 1 + n;

								for(int i = 2; i <= n/2; i++ ) {
												if ( n % i == 0 )
																ret = ret + i;
								}
								return ret;
				}

				public static long calcSum(int n) {
								if(n==1) return 1;
								return calcSum(n-1) + calcSumDivisor(n);
				}

				public static void main(String[] args) throws NumberFormatException, IOException {
								BufferedReader bf;
								StringBuilder sb = new StringBuilder();
								int nums;
								int num_array[];

								bf = new BufferedReader(new InputStreamReader(System.in));
								nums = Integer.parseInt(bf.readLine());
								num_array = new int[nums];
								for(int i=0; i<nums;i++) {
												num_array[i] = Integer.parseInt(bf.readLine());
								}

								for(int i=0; i<nums;i++) {
												long sum = calcSum(num_array[i]);
												sb.append(sum+"\n");
								}
								System.out.println(sb.toString());
				}
}
