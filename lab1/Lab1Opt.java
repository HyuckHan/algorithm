import java.util.*;
import java.math.*;

public class Lab1Opt {

	public static void main(String[] args) {
		int n = 3000;
		Random r = new Random(301);
		int arr[] =new int[n];
		BigInteger max = new BigInteger("1");

		for(int i=0; i<n; i++ )
			arr[i] = r.nextInt(999) + 1;

		int min_idx = 0;
		for(int i=1; i<n; i++ ) {
			if( arr[min_idx]>arr[i] )
				min_idx = i;
		} 

		BigInteger mul = new BigInteger("1"); 
		arr[min_idx]++; 
		for(int j=0; j<n; j++ ) { 
			mul = mul.multiply( new BigInteger( arr[j] + "" ) ); 
		}
		arr[min_idx]--;

		System.out.println( mul );
	}
}
