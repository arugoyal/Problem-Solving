int searchMatrix(int** a, int r, int c, int B) {
    int i,j,k=0;
    if(B>=a[0][0])
    {
    for(i=0;i<r;i++)
    {
        if(B<a[i][0])
        break;
    }
    for(j=0;j<c;j++)
    {
        if(B==a[i-1][j])
        {
            k=1;
            break;
        }
    }
    }
    return k;
}
