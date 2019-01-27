class trie{
    boolean EndofWord;
    Map <Character,trie> m;
    
    trie()
    {
        m=new HashMap<Character,trie>();
    }
    public trie node()
    {
        trie t=new trie();
        t.EndofWord=false;
        return t;
    }
    public void insert(trie root,String s)
    {
        int i;
        for(i=0;i<s.length();i++){
            if(! root.m.containsKey(s.charAt(i))) {
                root.m.put(s.charAt(i),node());
            }
            root=root.m.get(s.charAt(i));
        }
        root.EndofWord=true;
    }
    public boolean search(trie root,String s,int index)
    {
        if(index==s.length())
        {
            if(root.EndofWord==true)
                return true;
            return false;
        }
        if(root==null)
        return false;
        trie node=root.m.get(s.charAt(index));
        if(! root.m.containsKey(s.charAt(index)))
            return false;
        return search(node,s,index+1);
    }
}

class forsort {
    int index;
    int count;
    forsort(int i,int c)
    {
        index=i;
        count=c;
    }
    
   public static class nocomp implements Comparator <forsort>{
   @Override
    public int compare(forsort s1,forsort s2)
    {
       /* if(s2.count - s1.count >=0)
            return 1;
        else
            return -1;*/
            return s2.count-s1.count;
    }
    }
    public static final Comparator <forsort> no_c=new nocomp();
}

public class Solution {
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        String[] str=A.split("_");
        trie root=new trie();
        int l=str.length;
        int i;
        for(i=0;i<l;i++)
        {
            root.insert(root,str[i]);
        }
        ArrayList <forsort> k=new ArrayList<forsort> ();
        int n=B.size();
        int j;
        for(i=0;i<n;i++)
        {
            String[] s1=B.get(i).split("_");
            int count=0;
            for(j=0;j<s1.length;j++)
            {
                boolean b=root.search(root,s1[j],0);
                if(b==true)
                count++;
            }
            k.add(new forsort(i,count)); 
        }
        Collections.sort(k,forsort.no_c);
        ArrayList <Integer> g=new ArrayList<Integer>();
        n=k.size();
        for(i=0;i<n;i++)
        {
            g.add(k.get(i).index);
        }
       return g;
    }
}
