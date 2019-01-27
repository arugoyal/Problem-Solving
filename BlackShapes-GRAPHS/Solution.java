public class Solution {
    int row,col;
    public boolean safe(ArrayList<String> A,int i,int j,boolean[][]visited)
    {
        if((i>=0) && (i<row) && (j>=0) && (j<col))
        {
        String str=A.get(i);
        char ch=str.charAt(j);
        if(ch=='X' && visited[i][j]!=true)
            return true;
        }
        return false;
    }
    
    public void dfs(ArrayList<String> A,int i,int j,boolean[][]visited)
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
    
    public int black(ArrayList<String> A) {
        int n=A.size();
        String s=A.get(0);
        row=n;
        int n2=s.length();
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
    //System.out.println(n+" "+n2);
    for(i=0;i<n;i++)
    {
        String str=A.get(i);
       // char[] temp=str.toCharArray();
        for(j=0;j<n2;j++)
        {
            if(str.charAt(j)=='X' && visited[i][j]!=true)
            {
                dfs(A,i,j,visited);
                ++count;
            }
        }
    }
    return count;
    }
}
