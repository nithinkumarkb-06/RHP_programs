import java.util.*;
public class DP2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] grid = new int[R][C];
        long[][] dp = new long[R][C];

        for(int r = 0; r < R; r++)
        {
            for(int c = 0; c < C; c++)
            {
                grid[r][c] = sc.nextInt();
                if(c == 0)
                {
                    dp[r][c] = grid[r][c];
                }
            }
        }

        for(int c = 1; c < C; c++)
        {
            long[] fsmax = getfsmax(dp, c - 1, R);
            for(int r = 0; r < R; r++)
            {
                dp[r][c] = grid[r][c] + (dp[r][c - 1] == fsmax[0]? fsmax[1]: fsmax[0]);
            }
        }
        System.out.println(getfsmax(dp, C - 1, R)[0]);
    }

    private static long[] getfsmax(long[][] dp, int c, int R)
    {
        long fmax = Math.max(dp[0][c], dp[1][c]);
        long smax = Math.min(dp[0][c], dp[1][c]);
        for(int r = 2; r < R; r++)
        {
            if(dp[r][c] > fmax)
            {
                smax = fmax;
                fmax = dp[r][c];
            }
            else if(dp[r][c] > smax)
            {
                smax = dp[r][c];
            }
        }
        return new long[]{fmax, smax};
    }
}