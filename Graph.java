import java.util.*;
public class Graph {
    public static void main(String[] args) {
        int V = 5; 
       ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(4);
        graph.get(3).add(1);
        graph.get(4).add(2);
        
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + "->");
            for (Integer neighbor : graph.get(i)) {//we are using for each rather 
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
        boolean[] visited = new boolean[V]
        System.out.println("DFS Traversal:");
        dfs(graph, 0, visited);

    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph, int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (Integer neighbor : graph.get(start)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }
      public static void AddEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}
