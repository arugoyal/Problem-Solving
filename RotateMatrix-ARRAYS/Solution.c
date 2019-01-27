void rotate(int** A, int n, int n12) {
    int i,j,temp=0;
    for(i=0;i<n;i++)
    {
     for(j=i;j<(n-1-i);j++)
     {
         temp=A[i][j];
         A[i][j]=A[n-1-j][i];
         A[n-1-j][i]=A[n-1-i][n-1-j];
         A[n-1-i][n-1-j]=A[j][n-1-i];
         A[j][n-1-i]=temp;
     }
    }
    
}