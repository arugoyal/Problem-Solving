char* longestPalindrome(char* A) {
    int i,j,s=0,e=0,b=-99887,new;
    int l=strlen(A);
    //int *arr=(int*)calloc(sizeof(int),l);
    char str[100000];
    int k=0,m=0;
    while(A[k]!='\0')
    {
        str[m]='$';
        m++;
        str[m]=A[k];
        m++;
        k++;
    }
    str[m]='$';
    m++;
    str[m]='\0';
    int *arr=(int*)calloc(sizeof(int),m);
    for(i=0;i<m;)
    {
        while(s>0 && e<m && str[s]==str[e])
        {
            s--;
            e++;
        }
        if(str[s]!=str[e])
        {
            s++;
            e--;
        }
        arr[i]=e-s+1;
        new=e+1;
        for(j=i+1;j<=e;j++)
        {
        if(j+(arr[i-(j-i)]/2) < e)
        {
            arr[j]=arr[i-(j-i)];
        }
        else
        {
            if(arr[i-(j-i)] > 2*(e-j)+1)
                arr[j]=2*(e-j)+1;
            else
                arr[j]=arr[i-(j-i)];
        }
        if(j+(arr[i-(j-i)]/2) == e)
        {
            new=j;
            break;
        }
    }
    i=new;
    s=i;
    e=i;
    }
    for(i=0;i<m;i++)
    {
        b=(b<arr[i])? arr[i]:b;
    }
    for(i=0;i<m;i++)
    {
        if(b==arr[i])
        break;
    }
    static char str1[100000];
    int p=0;
    s=i-(arr[i]/2);
     e=i+(arr[i]/2);
    // printf("%d %d",s,e);
    for(j=s;j<=e;j++)
    {
        if(str[j]!='$')
        {
        str1[p]=str[j];
        p++;
        }
    }
    str1[p]='\0';
    //printf("%s",str1);
    return str1;
}
