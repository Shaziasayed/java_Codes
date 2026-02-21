import java.util.*;

public class Bellmanford {

    static class Pair {
        int vertex, weight;

        Pair(int v, int w) {
            vertex = v;
            weight = w;
        }
    }

    public static void main(String[] args) {

        int V = 5;
        List<List<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 2, 5);
        addEdge(graph, 1, 2, 2);
        addEdge(graph, 1, 3, 1);
        addEdge(graph, 2, 3, 9);
        addEdge(graph, 2, 4, 2);
        addEdge(graph, 3, 4, 4);

        int source = 0;

        int[] dist = bellmanFord(graph, source);

        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " -> " + dist[i]);
        }
    }

    static int[] bellmanFord(List<List<Pair>> graph, int source) {

        int V = graph.size();
        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int i = 0; i < V - 1; i++) {

            //for (int u = 0; u < V; u++) {
            for( int u = 0; u < V; u++) {
                for (Pair edge : graph.get(u)) {

                    int v = edge.vertex;
                    int w = edge.weight;

                    if (dist[u] != Integer.MAX_VALUE &&
                        dist[u] + w < dist[v]) {

                        dist[v] = dist[u] + w;
                    }
                }
            }
        }

        for (int u = 0; u < V; u++) {

            for (Pair edge : graph.get(u)) {

                int v = edge.vertex;
                int w = edge.weight;

                if (dist[u] != Integer.MAX_VALUE &&
                    dist[u] + w < dist[v]) {

                    System.out.println("Negative weight cycle detected");
                }
            }
        }

        return dist;
    }

    static void addEdge(List<List<Pair>> graph, int u, int v, int w) {

        graph.get(u).add(new Pair(v, w));
        graph.get(v).add(new Pair(u, w)); // remove this line for directed graph
    }
}