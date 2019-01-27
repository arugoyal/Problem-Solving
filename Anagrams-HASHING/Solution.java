public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        int i;
        ArrayList <ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
        Map <String,ArrayList<Integer>> m=new HashMap<>();
        ArrayList <Integer> arr=new ArrayList<Integer>();
        for(i=0;i<A.size();i++)
        {
            char[] temp=A.get(i).toCharArray();
            Arrays.sort(temp);
            String str=new String(temp);
            if(m.containsKey(str))
            {
            arr=m.get(str);
            arr.add(i+1);
            m.replace(str,arr);
            }
            else
            {
            m.put(str,new ArrayList<>());
            arr=m.get(str);
            arr.add(i+1);
            m.replace(str,arr);
            }
        }
        for (Map.Entry<String,ArrayList<Integer>> entry : m.entrySet())  
         {
             B.add(entry.getValue());
         } 
         return B;
    }
}
