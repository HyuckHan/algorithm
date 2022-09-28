public class PowerSet {

    public static void solution(boolean []item,
        boolean []bucket, int k, char []char_set) {

        if( k == 0 ) {
            System.out.print( "{" );
            for(int i=0; i<bucket.length; i++ ) {
                //System.out.print( bucket[i] + " " );
                if( bucket[i] ) {
                    System.out.print( char_set[i] + " " );
                }
            }
            System.out.println("}");
            return;
        }

        int lastIndex = bucket.length - k - 1;
        for(int i=0; i<item.length; i++ ) {
            bucket[lastIndex+1] = item[i];
            solution(item,bucket,k-1,char_set);
        }
    }

    public static void main(String[] args) {
        char []char_set = { 'a', 'b', 'c' };
        boolean []item = {true, false};
        boolean []bucket = new boolean[char_set.length];

        solution( item, bucket, char_set.length, char_set );
    }
}
