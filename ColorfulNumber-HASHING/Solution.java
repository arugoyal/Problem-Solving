public class Solution {
    public int colorful(int A) {
        int i=0,j=0;
        int[] arr=new int[234567];
        HashSet <Integer> h = new HashSet<>();
        while(A>0)
        {
            arr[j]=A%10;
            j++;
            A=A/10;
        }
        int k,m;
        for(i=0;i<j;i++)
        {
            if(h.contains(arr[i]))
            return 0;
            h.add(arr[i]);
            k=arr[i];
            for(m=i+1;m<j;m++)
            {
                k=k*arr[j];
                if(h.contains(k))
                return 0;
                h.add(k);
            }
        }
        return 1;
        }
}
