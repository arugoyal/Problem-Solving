class card{
      int x;
      int y;
      card(int x,int y)
      {
          this.x = x;
          this.y = y;
      }
}

public class Solution {
    //Queue <card> q=new Queue<card>();
    public int knight(int A, int B, int C, int D, int E, int F) {
        Queue <card> q=new LinkedList<>();
        boolean visited[][] = new boolean[A+1][B+1];
        int[][] dir={{-1,-2},{-1,2},{1,-2},{1,2},{-2,-1},{2,-1},{-2,1},{2,1}};
        card obj=new card(C,D);
        q.add(null);
        q.add(obj);
        int count=0;
        visited[C][D]=true;
        while(!q.isEmpty() && visited[E][F]!=true)
        {
            card o=q.poll();
            if(o==null)
            {
                if(q.isEmpty())
                break;
                count++;
                q.add(null);
                continue;
            }
                for(int i=0;i<8;i++)
                {
                    int x=o.x+dir[i][0];
                    int y=o.y+dir[i][1];
                    if(x>0 && x<=A && y>0 && y<=B && visited[x][y]==false)
                    {
                    visited[x][y]=true;
                    card k=new card(x,y);
                    q.add(k);
                    }
                }
            
        }
        if(visited[E][F]==false)
            return -1;
        return count;
}
}
