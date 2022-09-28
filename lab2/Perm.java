public class Perm {

    public static void solution(char []item,
        char []bucket, int k) {

        if( k == 0 ) {
            for(int i=0; i<bucket.length; i++ ) { 
                System.out.print( bucket[i] + " " );
            }
            System.out.println();
            return;
        }

        int lastIndex = bucket.length - k - 1;
        for(int i=0; i<item.length; i++ ) {
            int flag = 0;
            for(int j=0; j<=lastIndex; j++) {
                if( item[i] == bucket[j] ) {
                    flag = 1;
                    break;
                }
            }
            if( flag == 1 ) continue;
            bucket[lastIndex+1] = item[i];
            solution(item,bucket,k-1);
        }
    }

    public static void main(String[] args) {
        char []item = { 'a', 'b', 'c' };
        char []bucket = new char[item.length];

        solution( item, bucket, item.length);
    }
}
