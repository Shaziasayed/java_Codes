import java.util.*;

class Dijkstars {

//     static class Edge {
//         int dest, weight;

//         Edge(int d, int w) {
//             dest = d;
//             weight = w;
//         }
//     }

//     static class Graph {
//         private int V;
//         private List<List<Edge>> adj;

//         Graph(int v) {
//             V = v;
//             adj = new ArrayList<>();

//             for (int i = 0; i < v; i++) {
//                 adj.add(new ArrayList<>());
//             }
//         }

//         void addEdge(int src, int dest, int weight) {
//             adj.get(src).add(new Edge(dest, weight));
//         }

//         int getVertices() {
//             return V;
//         }

//         List<Integer> getNeighbors(int u) {
//             List<Integer> neighbors = new ArrayList<>();
//             for (Edge e : adj.get(u)) {
//                 neighbors.add(e.dest);
//             }
//             return neighbors;
//         }

//         int getWeight(int u, int v) {
//             for (Edge e : adj.get(u)) {
//                 if (e.dest == v)
//                     return e.weight;
//             }
//             return Integer.MAX_VALUE;
//         }
//     }

//     public static void main(String[] args) {

//         Graph graph = new Graph(5);

//         graph.addEdge(0, 1, 10);
//         graph.addEdge(0, 2, 5);
//         graph.addEdge(1, 2, 2);
//         graph.addEdge(1, 3, 1);
//        // graph.addEdge(2, 1, 3);
//         graph.addEdge(2, 3, 9);
//         graph.addEdge(2, 4, 2);
//         graph.addEdge(3, 4, 4);
//        // graph.addEdge(4, 3, 6);

//         int source = 0;

//         int[] distances = dijkstra(graph, source);

//         System.out.println("Shortest distances from vertex " + source + ":");
//         for (int i = 0; i < distances.length; i++) {
//             System.out.println("To vertex " + i + ": " + distances[i]);
//         }
//     }

//     public static int[] dijkstra(Graph graph, int source) {

//         int V = graph.getVertices();

//         int[] distances = new int[V];
//         boolean[] visited = new boolean[V];

//         Arrays.fill(distances, Integer.MAX_VALUE);
//         distances[source] = 0;

//         for (int count = 0; count < V - 1; count++) {

//             int u = minDistance(distances, visited);

//             if (u == -1)
//                 break;

//             visited[u] = true;

//             for (int neighbor : graph.getNeighbors(u)) {

//                 if (!visited[neighbor] && distances[u] != Integer.MAX_VALUE) {

//                     int newDist = distances[u] + graph.getWeight(u, neighbor);

//                     if (newDist < distances[neighbor]) {
//                         distances[neighbor] = newDist;
//                     }
//                 }
//             }
//         }
//         return distances;
//     }

//     private static int minDistance(int[] distances, boolean[] visited) {

//         int min = Integer.MAX_VALUE;
//         int minIndex = -1;

//         for (int v = 0; v < distances.length; v++) {
//             if (!visited[v] && distances[v] < min) {
//                 min = distances[v];
//                 minIndex = v;
//             }
//         }
//         return minIndex;
//     }
// }
static class Pair {
        int vertex, distance;

        Pair(int v, int d) {
            vertex = v;
            distance = d;
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

        int[] distances = dijkstra(graph, source);

        System.out.println("Shortest distances from vertex " + source + ":");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("To vertex " + i + ": " + distances[i]);
        }
    }

    public static int[] dijkstra(List<List<Pair>> graph, int source) {

        int V = graph.size();

        int[] distances = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));
        pq.offer(new Pair(source, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.vertex;

            if (visited[u])
                continue;

            visited[u] = true;

            for (Pair neighbor : graph.get(u)) {
                if (!visited[neighbor.vertex]) {
                    int newDist = distances[u] + neighbor.distance;
                    if (newDist < distances[neighbor.vertex]) {
                        distances[neighbor.vertex] = newDist;
                        pq.offer(new Pair(neighbor.vertex, newDist));
                    }
                }
            }
        }
        return distances;
    }

    private static void addEdge(List<List<Pair>> graph, int src, int dest, int weight) {
        graph.get(src).add(new Pair(dest, weight));
    }
}