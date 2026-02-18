import java.util.*;

class Solution {

    public boolean isCycle(Map<String, List<String>> graph) {

        HashSet<String> visited = new HashSet<>();

        for (String node : graph.keySet()) {

            if (!visited.contains(node)) {
                if (dfs(node, null, visited, graph)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(String node, String parent,
                        HashSet<String> visited,
                        Map<String, List<String>> graph) {

        visited.add(node);

        for (String neighbor : graph.get(node)) {

            if (!visited.contains(neighbor)) {

                if (dfs(neighbor, node, visited, graph))
                    return true;
            }

            else if (!neighbor.equals(parent)) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D"));
        graph.put("C", Arrays.asList("A"));
        graph.put("D", Arrays.asList("B"));

        Solution solution = new Solution();
        boolean hasCycle = solution.isCycle(graph);
        System.out.println("Graph has cycle: " + hasCycle);
    }
}
