import java.util.*;
public class adjacentSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int R=sc.nextInt(), C=sc.nextInt();
        int grid[][]=new int[R][C];
        for(int r=0;r<R;r++)
        {
            for(int c=0;c<C;c++)
            {
                grid[r][c]=sc.nextInt();
            }
        }
        int row=sc.nextInt(), col=sc.nextInt();
        int diff[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        long sum=0;
        for(int i=0;i<8;i++)
        {
            int r=row+diff[i][0], c=col+diff[i][1];
            if(r>=0 && r<R && c>=0 && c<C)
                sum+=grid[r][c];
        }
        System.out.println(sum);
    }
}
