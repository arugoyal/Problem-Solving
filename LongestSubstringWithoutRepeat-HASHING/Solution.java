public class Solution {
    public int lengthOfLongestSubstring(String A) {
        Map <Character,Integer> m=new HashMap<>();
        Queue <Integer> max=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b)
            {
                return -1*a.compareTo(b);
            }
            });
        char[] temp=A.toCharArray();
        int i,c;
        for(i=0;i<temp.length;i++)
        {
            if(m.containsKey(temp[i])==true)
            {
                c=m.get(temp[i]);
                max.add(m.size());
                m.clear();
                i=c;
            }
            else if(m.containsKey(temp[i])==false)
            {
                m.put(temp[i],i);
            }
        }
        if(m.size()!=0)
        max.add(m.size());
        return max.peek();
    }
}
