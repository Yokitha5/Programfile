//public class graph{
//    private int matrix[][];
//    private int numvertice;
//    graph(int numvertice){
//        this.numvertice=numvertice;
//        matrix=new int[numvertice][numvertice];
//    }
//    public void addEdge(int s,int d){
//        matrix[s][d]=1;
//        matrix[d][s]=1;
//    }
//    public void printGraph() {
//        System.out.println("Adjacency Matrix:");
//        for (int i = 0; i < numvertice; i++) {
//            for (int j = 0; j < numvertice; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        graph graph = new graph(5);
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);
//
//        graph.printGraph();
//    }
//}



//import java.util.*;
//
//public class graph {
//    private int numVertices;
//    private ArrayList<LinkedList<Integer>> adjList;
//
//    public graph(int numVertices) {
//        this.numVertices = numVertices;
//        adjList = new ArrayList<>(numVertices);
//
//        for (int i = 0; i < numVertices; i++) {
//            adjList.add(new LinkedList<>());
//        }
//    }
//
//    public void addEdge(int source, int dest) {
//        adjList.get(source).add(dest);
//        adjList.get(dest).add(source);
//    }
//
//    public void printGraph() {
//        System.out.println("Adjacency List:");
//        for (int i = 0; i < numVertices; i++) {
//            System.out.print("Vertex " + i + ": ");
//            for (int neighbor : adjList.get(i)) {
//                System.out.print("-> " + neighbor + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        graph graph = new graph(5);
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);
//
//        graph.printGraph();
//    }
//}




//class graph{
//    class node{
//        int val;
//        node next;
//        node(int val){
//            this.val = val;
//            this.next=null;
//        }
//    }
//    private int numvertice;
//    private node[] matrix;
//    public graph(int numvertice){
//        this.numvertice= numvertice;
//        matrix= new node[numvertice];
//    }
//    public void addEdge(int s,int d){
//        node newnode= new node(d);
//        newnode.next=matrix[s];
//        matrix[s]= newnode;
//        node newnode2= new node(s);
//        newnode2.next=matrix[d];
//        matrix[d]= newnode2;
//    }
//    public void printGraph() {
//        for (int i = 0; i < numvertice; i++) {
//            node temp = matrix[i];
//            System.out.print("Vertex " + i + " is connected to: ");
//            while (temp != null) {
//                System.out.print(temp.val + " ");
//                temp = temp.next;
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        graph g = new graph(5);
//        g.addEdge(0, 1);
//        g.addEdge(0, 4);
//        g.addEdge(1, 2);
//        g.addEdge(1, 3);
//        g.addEdge(1, 4);
//        g.addEdge(2, 3);
//        g.addEdge(3, 4);
//
//        g.printGraph();
//    }
//}


//import java.util.*;
//
//public class DirectedCycle {
//    private int V;
//    private LinkedList<Integer>[] adj;
//
//    public DirectedCycle(int V) {
//        this.V = V;
//        adj = new LinkedList[V];
//        for (int i = 0; i < V; i++) adj[i] = new LinkedList<>();
//    }
//
//    public void addEdge(int v, int w) {
//        adj[v].add(w);
//    }
//
//    private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {
//        if (recStack[i]) return true; // Cycle detected
//        if (visited[i]) return false;
//
//        visited[i] = true;
//        recStack[i] = true;
//
//        for (Integer neighbor : adj[i]) {
//            if (isCyclicUtil(neighbor, visited, recStack)) return true;
//        }
//
//        recStack[i] = false; // Remove from stack as we backtrack
//        return false;
//    }
//
//    public boolean hasCycle() {
//        boolean[] visited = new boolean[V];
//        boolean[] recStack = new boolean[V];
//
//        for (int i = 0; i < V; i++) {
//            if (isCyclicUtil(i, visited, recStack)) return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        DirectedCycle g = new DirectedCycle(4);
//        g.addEdge(0, 1);
//        g.addEdge(1, 2);
//        g.addEdge(2, 0); // This creates the cycle 0 -> 1 -> 2 -> 0
//        g.addEdge(2, 3);
//
//        System.out.println("Does graph have cycle? " + g.hasCycle());
//    }
//}


//
//import java.util.*;
//
//public class graph {
//    private int V;
//    private LinkedList<Integer>[] adj;
//
//    public graph(int V) {
//        this.V = V;
//        adj = new LinkedList[V];
//        for (int i = 0; i < V; i++) adj[i] = new LinkedList<>();
//    }
//
//    public void addEdge(int v, int w) {
//        adj[v].add(w);
//    }
//
//    public void bfs(int startNode) {
//        boolean[] visited = new boolean[V];
//        Queue<Integer> queue = new LinkedList<>();
//
//        visited[startNode] = true;
//        queue.add(startNode);
//
//        System.out.print("BFS Traversal: ");
//        while (!queue.isEmpty()) {
//            int current = queue.poll();
//            System.out.print(current + " ");
//
//            for (int neighbor : adj[current]) {
//                if (!visited[neighbor]) {
//                    visited[neighbor] = true;
//                    queue.add(neighbor);
//                }
//            }
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        graph g = new graph(4);
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 2);
//        g.addEdge(2, 0);
//        g.addEdge(2, 3);
//        g.addEdge(3, 3);
//
//        g.bfs(2);
//    }
//}


import java.util.*;

public class graph {
    private int V;
    private LinkedList<Integer>[] adj;

    public graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) adj[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adj[v]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public void dfs(int startNode) {
        System.out.print("DFS Traversal: ");
        dfsUtil(startNode, new boolean[V]);
        System.out.println();
    }

    public static void main(String[] args) {
        graph g = new graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.dfs(2);
    }
}