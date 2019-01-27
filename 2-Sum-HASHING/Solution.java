public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        int i=0,j,k,c=0,flag=0;
        Map <Integer,Integer> m=new HashMap<>();
        ArrayList <Integer> D=new ArrayList<>();
        for(i=0;i<A.size();i++)
        {
            k=B-A.get(i);
            if(m.containsKey(A.get(i))==true)
            {
                c=m.get(A.get(i));
                flag=1;
                break;
            }
            else if(m.containsKey(k)==false)
            {
                m.put(k,i);
            }
        }
        if(flag==1)
        {
        D.add(c+1);
        D.add(i+1);
        }
        return D;
    }
}
