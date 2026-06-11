class islands
{
    final int diff[][]={{0,-1},{0,1},{-1,0},{1,0}};
    private void dfs(char grid[][],int R, int C,int r, int c)
    {
        grid[r][c]='0';
        for(int i=0;i<4;i++)
        {
            int ar=r+diff[i][0], ac=c+diff[i][1];
            if(ar>=0 && ar<R && ac>=0 && ac<C && grid[ar][ac]=='1')
                dfs(grid,R,C,ar,ac);
        }
    }

    public int numIslands(char[][] grid) {
        int R=grid.length, C=grid[0].length, count=0;
        for(int r=0;r<R;r++)
        {
            for(int c=0;c<C;c++)
            {
                if(grid[r][c]=='1')
                {
                    count++;
                    dfs(grid,R,C,r,c);
                }
            }
        }
        return count;
    }
}