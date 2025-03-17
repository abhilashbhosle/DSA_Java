
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

// Is Graph Cyclic?
class Edge {

    int src;
    int nbr;

    Edge(int src, int nbr) {
        this.src = src;
        this.nbr = nbr;
    }
}

class Pair {

    int vertex;
    String psf;

    Pair(int vertex, String psf) {
        this.vertex = vertex;
        this.psf = psf;
    }
}

public class DetectCycle {

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {0, 3}, {3, 4}, {4, 5}, {5, 6}, {4, 6}};
        int v = 8;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                boolean cycle = checkCycle(graph, i, visited);
                if (cycle) {
                    System.out.println("Cycle detected");
                    return;
                }
            }
        }
		System.out.println("No cycle detected");
    }

    public static boolean checkCycle(ArrayList<Edge>[] graph, int src, boolean[] visited) {
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src + ""));
        while (!q.isEmpty()) {
            Pair rem = q.remove();
            if (visited[rem.vertex]==true) {
                System.out.println("Cycle detected at " + rem.vertex + " and path of the cycle is " + rem.psf);
                return true;
            }
			visited[rem.vertex] = true;
            for (Edge e : graph[rem.vertex]) {
                if (visited[e.nbr] == false) {
                    q.add(new Pair(e.nbr, rem.psf + e.nbr));
                }
            }
        }
		return false;
    }
}
