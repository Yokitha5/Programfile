import java.util.*;
public class dijistra{
    public int[] diji(int[][] graph,int src){
        int n = graph.length;
        int[] dist= new int[n];
        boolean visited[] = new boolean[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        for(int i=0;i<n;i++){
            int u=-1;
            for(int j =0;j<n;j++){
                if(!visited[j] && (u==-1 || dist[i]<dist[u] )){
                    u=i;
                }
            }
            if(dist[u]==Integer.MAX_VALUE) break;
            visited[u]=true;
            for(int v=0;v<n;v++){
                if(graph[u][v]!=0 && !visited[v]){
                    int newdist= dist[u]+graph[u][v];
                    if(newdist<dist[v]){
                        dist[v]=newdist;
                    }
                }
            }
        }
        return dist;

    }
    public static void main(String[] args){
        dijistra obj = new dijistra();
        int[][] graph = {
                {0, 2, 4},   // node 0 → node1=2, node2=4
                {2, 0, 1},   // node 1 → node0=2, node2=1
                {4, 1, 0}    // node 2 → node0=4, node1=1
        };
        int res[] = obj.diji(graph,0);
        for(int i=0;i<graph.length;i++){
            if(i==graph.length-1) System.out.println(res[i]+" ");
        }
    }
}