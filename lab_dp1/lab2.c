#include<stdio.h>

int right_max_sum(int *A, int left, int right) {
    int i, max_sum, sum ;
    sum = A[left];
    max_sum = A[left];

    for( i=left+1; i<=right; i++ ) {
        sum = sum + A[i];
        if ( max_sum < sum )
            max_sum = sum;
    }

    return max_sum;
}

int left_max_sum(int *A, int left, int right) {
    int i, max_sum, sum ;
    sum = A[right];
    max_sum = A[right];

    for( i=right-1; i>=left; i-- ) {
        sum = sum + A[i];
        if ( max_sum < sum )
            max_sum = sum;
    }

    return max_sum;
}

int find_max(int *A, int left, int right) {
    int V1, V2, V3;
    int mid, max;

    if(left == right) return A[left];

    mid = (left+right)/2;
    V1 = find_max( A, left, mid);
    V2 = find_max( A, mid+1, right);

    V3 = left_max_sum(A, left, mid ) + right_max_sum(A, mid+1, right);

    max = (V1>V2)?V1:V2;
    max = (max>V3)?max:V3;
    return max;
}

int main() {

    int A[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    printf("max value = %d\n", find_max(A, 0, 8));

    return 0;
}
