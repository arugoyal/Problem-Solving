public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        PriorityQueue <ListNode> min = new PriorityQueue <ListNode>(10,new Comparator <ListNode>
                    () { public int compare (ListNode x,ListNode y)
                    {
                          return x.val-y.val;
                    }
                         });
        int i=0;
        int n=a.size();
        //ListNode t=null;
        for(i=0;i<n;i++)
        {
        min.add(a.get(i));
        }
        ListNode k=min.poll();
        ListNode h=new ListNode(k.val);
        ListNode p=h;
        if(k.next != null)
            min.add(k.next);
        while(min.size() != 0)
        {
            ListNode m=min.poll();
            ListNode t=new ListNode(m.val);
            h.next=t;
            h=t;
            if(m.next != null)
            min.add(m.next);
        }
       return p;
    }
}
