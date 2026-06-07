import java.util.*;
public class DP1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] grid = new int[R][C];
        long dp[][] = new long[R][C];
        for(int r=0;r<R;r++)
        {
            for(int c=0;c<C;c++)
            {
                grid[r][c] = sc.nextInt();
                if(r==0)
                {
                    dp[r][c]=grid[r][c];
                }
            }
        }
        for(int r=1;r<R;r++)
        {
            long fsmax[]=getfsmax(dp,r-1,C);
            for(int c=0;c<C;c++)
            {
                dp[r][c]=grid[r][c]+(dp[r-1][c]==fsmax[0]?fsmax[1]:fsmax[0]);
            }
        }
        System.out.println(getfsmax(dp,R-1,C)[0]);
    }
    private static long[] getfsmax(long[][] dp, int r, int C)
    {
        long fmax=Math.max(dp[r][0],dp[r][1]);
        long smax=Math.min(dp[r][0],dp[r][1]);
        for(int c=2;c<C;c++)
        {
            if(dp[r][c]>fmax)
            {
                smax=fmax;
                fmax=dp[r][c];
            }
            else if(dp[r][c]>smax)
            {
                smax=dp[r][c];
            }
        }
        return new long[]{fmax,smax};
    }
}