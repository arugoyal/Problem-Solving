public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i,j;
        int n=A.size();
        ArrayList <Integer> c=new ArrayList<Integer>();
        PriorityQueue <Integer> max=new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return -1*a.compareTo(b);
            }
        });
        PriorityQueue <Integer> min=new PriorityQueue<Integer>();
        Collections.sort(A,Collections.reverseOrder());
        Collections.sort(B,Collections.reverseOrder());
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(min.size() <= n)
                min.add(A.get(i)+B.get(j));
                
                if(min.size() > n)
                    min.remove();
            }
        }
        for(i=0;i<n;i++)
        max.add(min.poll());
         for(i=0;i<n;i++)
        c.add(max.poll());
        return c;
    }
}
