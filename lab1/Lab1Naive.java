import java.util.*;
import java.math.*;

public class Lab1Naive {

	public static void main(String[] args) {
		int n = 3000;
		Random r = new Random(301);
		int arr[] =new int[n];
		BigInteger max = new BigInteger("1");

		for(int i=0; i<n; i++ )
			arr[i] = r.nextInt(999) + 1;

		for(int i=0; i<n; i++ ) {
			BigInteger mul = new BigInteger("1");
			arr[i]++;
			for(int j=0; j<n; j++ ) {
				mul = mul.multiply( new BigInteger( arr[j] + "" ) );
			}

			if( max.compareTo( mul ) == -1 ) {
				max = mul;
			}
			arr[i]--;
		}
		System.out.println( max );
	}
}
