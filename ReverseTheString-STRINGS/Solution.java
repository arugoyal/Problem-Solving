public class Solution {
    public String reverseWords(String a) {
        String[] temp=a.split(" ");
        String b=new String();
        int i=0,j=temp.length-1;
        while(i<j)
        {
            b=temp[i];
            temp[i]=temp[j];
            temp[j]=b;
            i++;
            j--;
        }
        String c=new String();
        for(i=0;i<temp.length;i++)
        {
        c=c+temp[i];
        if(i!=temp.length-1)
        c=c+" ";
        }
        return c;
    }
}
