int ** generateMatrix(int A, int *len1, int *len2) {
    *len1=A;
    *len2=A;
    int **x=(int**)malloc(sizeof(int*)*A);
    int i,t=0,b=(A-1),l=0,r=(A-1),a=1;
    for(i=0;i<A;i++)
    {
        x[i]=(int *)malloc(sizeof(int)*A);
    }
    while((t<=b)&&(l<=r))
    {
        for(i=l;i<=r;i++)
        {
        x[t][i]=a;
        a++;
        }
        t++;
         for(i=t;i<=b;i++)
        {
        x[i][r]=a;
        a++;
        }
        r--;
         for(i=r;i>=l;i--)
        {
        x[b][i]=a;
        a++;
        }
        b--;
         for(i=b;i>=t;i--)
        {
        x[i][l]=a;
        a++;
        }
        l++;
    }
    return x;
}
