import java.util.*;
public class rat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] arr={{'.', '.', '.'},
                      {'.', '#', '.'},
                      {'#', '.', '.'}};
        int start1=0;
        int start2=0;
        int end1=2;
        int end2=2;
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
        Queue <int[]> queue = new LinkedList<>();
        boolean[][] visited= new boolean[arr.length][arr[0].length];
        boolean flag=false;
        queue.add(new int[]{start1,start2});
        int count=0;
        while(!queue.isEmpty()){

            int[] val = queue.poll();
            count++;
            int r =val[0];
            int c= val[1];
            if(r==end1 && c==end2){
                flag=true;
                break;
            }
            for(int[] d : dir){
                int nr=r+ d[0];
                int nc=c+ d[1];
                System.out.println(nr+" "+nc);

                if(nc>=0 && nr>=0 &&nc<arr[0].length && nr<arr.length && arr[nr][nc]=='.' && !visited[nr][nc]){
                    visited[nr][nc]=true;
                    queue.add(new int[]{nr,nc});
                }
            }
        }
        System.out.println(flag);
        System.out.print(count);
    }
}