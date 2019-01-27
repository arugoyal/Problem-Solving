/**
 * @input A : Integer
 * 
 * @Output Integer
 */
 #include<math.h>
unsigned int reverse(unsigned int A) {
    int i,j=1,b;
    unsigned int x=0;
    for(i=31;i>=0;i--)
    {
        b=j&A;
        if(b!=0)
        x=x+(pow(2,i)*1);
        else
        x=x+(pow(2,i)*0);
        j=j<<1;
    }
    return x;
}
