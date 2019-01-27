int maxSubArray(const int* A, int n) {
    int i,j,sum=A[0],msum=A[0];
    for(i=1;i<n;i++)
    {
        if(sum+A[i]>A[i])
        sum=sum+A[i];
        else
        sum=A[i];
        if(sum>msum)
        msum=sum;
    }
    return msum;
}
