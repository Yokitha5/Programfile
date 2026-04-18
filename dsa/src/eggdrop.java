import java.util.Scanner;

public class eggdrop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 36;
        int k = 36;
        eggdrop obj = new eggdrop();
        obj.calculate(n,k);

    }
    public void calculate(int egg,int floor){
        int dp[][] = new int[egg+1][floor+1];
        for(int i=1;i<=floor;i++){
            dp[1][i]=i;

        }
        for(int i=1;i<=egg;i++){
            dp[i][1]=1;

        }

        for (int i = 2; i <= egg; i++) {
            for (int j = 2; j <= floor; j++) {
                int min= Integer.MAX_VALUE;
                for (int k = 1; k <= j; k++) {
                    int res = Math.max(dp[i - 1][k - 1], dp[i][j-k]);
                    min = Math.min(res,min);
                    dp[i][j] = min+1;
                }
            }
        }
        for(int i=0;i<=egg;i++){
            for(int j=0;j<=floor;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(dp[egg][floor]);

    }
}