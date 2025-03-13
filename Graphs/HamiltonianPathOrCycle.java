
import java.util.ArrayList;
import java.util.HashSet;

class Edge {
    int src;
    int nbr;
    public Edge(int src, int nbr) {
        this.src = src;
        this.nbr = nbr;
    }
}

public class HamiltonianPathOrCycle {

    public static void main(String[] args) {
        int[][] edges = {
            {0, 1}, {1, 2}, {2, 3}, {3, 0},
            {3, 4}, {4, 5}, {5, 6}, {6, 3},
            {2, 5}, {5, 6}
        };
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[edges.length];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int v1 = edge[0];
            int v2 = edge[1];
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }
        int src = 0;
        HashSet<Integer> visited = new HashSet<>();
        int osrc = src; // original source
        findPathAndCycle(graph, visited, src, src + "",osrc);
    }

    private static void findPathAndCycle(ArrayList<Edge>[] graph, HashSet<Integer> visited, int src, String psf, int osrc) {
        if (visited.size() == graph.length - 1) {
            System.out.print(psf);
            boolean foundCycle = false;
            for (Edge e : graph[src]) {
                if (e.nbr == osrc) {
                    foundCycle = true;
                    break;
                }
            }
            if (foundCycle == true) {
                System.err.println("*");
            } else {
                System.out.println(".");
            }
			return;
        }
        visited.add(src);
        for (Edge e : graph[src]) {
            if (!visited.contains(e.nbr)) {
                findPathAndCycle(graph, visited, e.nbr, psf + e.nbr, osrc);
            }
        }
        visited.remove(src);
    }
}


