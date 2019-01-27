public class Solution {
    int row,col;
    public boolean safe(ArrayList<ArrayList<Character>> A,int i,int j,boolean[][]visited)
    {
        if((i>=0) && (i<row) && (j>=0) && (j<col))
        {
        ArrayList<Character> str=A.get(i);
        char ch=str.get(j);
        if(ch=='O' && visited[i][j]!=true)
            return true;
        }
        return false;
    }
    
    public void dfs(ArrayList<ArrayList<Character>> A,int i,int j,boolean[][]visited)
    {
        int[] u=new int[]{0,-1,0,1};
        int[] v=new int[]{-1,0,1,0};
        visited[i][j]=true;
        for(int k=0;k<4;k++)
        {
            if(safe(A,i+u[k],j+v[k],visited))
            {
                dfs(A,i+u[k],j+v[k],visited);
            }
        }
    }
    
    public void solve(ArrayList<ArrayList<Character>> A) {
        int n=A.size();
        ArrayList<Character> s=A.get(0);
        row=n;
        int n2=s.size();
        col=n2;
        int count=0,i,j;
    boolean[][] visited=new boolean[n][n2];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n2;j++)
        {
        visited[i][j]=false;
        }
    }
    
    int t=2;
    i=0;
    while(t-- >0 )
    {
        //i=0;
        ArrayList <Character> str=A.get(i);
        for(j=0;j<n2;j++)
        {
            if(str.get(j)=='O' && visited[i][j]!=true)
            {
                dfs(A,i,j,visited);
            }
        }
        i=n-1;
    }
    t=2;
    j=0;
    while(t-- >0 )
    {
        //j=0;
        for(i=1;i<n-1;i++)
        {
            ArrayList<Character> str1=A.get(i);
            if(str1.get(j)=='O' && visited[i][j]!=true)
            {
                dfs(A,i,j,visited);
            }
        }
        j=n2-1;
    }
    //System.out.println(n+" "+n2);
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            if(visited[i][j]==false)
            A.get(i).set(j,'X');
            //System.out.println(A.get(i).get(j));
        }
    }
    

   //System.out.println();
    //}
    }
}

