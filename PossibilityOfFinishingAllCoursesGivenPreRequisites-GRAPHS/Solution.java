public class Solution {
    int v;
    LinkedList <Integer> adj[];
    
    public int dfs(int u,int[] arr)
    {
        arr[u]=1;
        for(int i=0;i<adj[u].size();i++)
        {
            int v=adj[u].get(i);
            if(arr[v]==1)
            return 0;
            dfs(v,arr);
        }
        arr[u]=2;
        return 1;
    }
    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
        v=A;
        adj=new LinkedList[v+1];
        for(int i=0;i<=v;i++)
            adj[i]=new LinkedList<>();
            //adj[0].add(0);
        for(int i=0;i<B.size();i++)
        {
            adj[B.get(i)].add(C.get(i));
        }
        int[] arr=new int[v+1];
        int a=1;
        for(int i=0;i<B.size();i++)
        {
            a=dfs(B.get(i),arr);
            if(a==0)
            break;
        }
        return a;
    }
}
