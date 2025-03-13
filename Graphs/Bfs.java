
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
 class Edge {
    int src;
    int nbr;
    Edge(int src, int nbr) {
        this.src = src;
        this.nbr = nbr;
    }
}
 class Pair{
	int vertex;
	String psf;
	Pair(int vertex, String psf){
		this.vertex=vertex;
		this.psf=psf;
	}
}
public class Bfs {
    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {0, 3}, {3, 4}, {4, 5}, {5, 6}, {4, 6}};
		int v=8;
		ArrayList<Edge>[] graph=new ArrayList[v];
		for(int i=0;i<v;i++){
			graph[i]=new ArrayList<>();
		}
        for (int[] edge : edges) {
            int v1 = edge[0];
            int v2 = edge[1];
            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }
		int source=2;
		String psf=source+"";
		boolean[] visited=new boolean[v];
		Queue<Pair> q=new ArrayDeque<>();
		findBfs(graph, source, psf, visited, q);
    }
	public static void findBfs(ArrayList<Edge>[] graph, int source, String psf, boolean[] visited, Queue<Pair> q){
		q.add(new Pair(source,psf));
		while(!q.isEmpty()){
			Pair rem=q.remove();
			System.out.println(rem.vertex+"@"+rem.psf);
			for(Edge edge:graph[rem.vertex]){
				if(visited[edge.nbr]==false){
					q.add(new Pair(edge.nbr, rem.psf+edge.nbr));
					visited[edge.nbr]=true;
				}
			}
		}
	}
}
