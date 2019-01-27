int coverPoints(int* A, int n1, int* B, int n2) {
    int i,j,k,s=0;
    if(n1>1)
    {
    for(i=0;i<(n1-1);i++)
    {
        j=abs(A[i+1]-A[i]);
         k=abs(B[i+1]-B[i]);
         if(j>=k)
         s=s+j;
         else
         s=s+k;
    }
    }
    return s;
}
