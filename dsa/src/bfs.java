import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class bfs{
    int vertice;
    LinkedList<Integer>[] adj;
    bfs(int vertice){
        this.vertice = vertice;
        adj = new LinkedList[vertice];
        for(int i=0;i<vertice;i++){
            adj[i]= new LinkedList<>();
        }
    }
    void add(int s,int v){
        adj[s].add(v);
    }
    public void bfs(int s){
        boolean[] visited= new boolean[vertice];
        Queue<Integer> q= new LinkedList<>();
        visited[s]= true;
        q.add(s);
        while(!q.isEmpty()){
            int c = q.poll();
            System.out.print(c+" ");
            for(int n :adj[c]){
                if(!visited[n]){
                    visited[n]= true;
                    q.add(n);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vertice = sc.nextInt(), edge= sc.nextInt();
        bfs obj = new bfs(vertice);
        for(int i=0;i<edge;i++){
            obj.add(sc.nextInt(),sc.nextInt());
        }
        obj.bfs(sc.nextInt());
    }

}