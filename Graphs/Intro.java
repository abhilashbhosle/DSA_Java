
import java.util.ArrayList;
import java.util.List;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Graph {

    int[][] adjMatrix;
    List<List<Integer>> list;

    Graph(int nodes) {
        adjMatrix = new int[nodes][nodes];
        list = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            list.add(new ArrayList<>());
        }
    }

    public void addEdgesToMatrix(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (isDirected) {
                adjMatrix[u][v] = 1;
            } else {
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }
	 public void getEdges() {
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + ",");
            }
            System.out.println();
        }
    }
    public void addEdgesToList(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (isDirected) {
                list.get(u).add(v);
            } else {
                list.get(u).add(v);
                list.get(v).add(u);
            }
        }
    }
	public void getEdgesFromList() {
        for (int i = 0; i < list.size(); i++) {
			System.out.print(i + "-> ");
			System.out.print("[");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + ",");
            }
			System.out.print("]");
            System.out.println();
        }
    }
}

public class Intro {

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}};
        int nodes = 4;
        Graph graph = new Graph(nodes);
        graph.addEdgesToList(edges, false);
        graph.getEdgesFromList();
    }
}
