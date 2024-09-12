package Graph;

public class GraphTestDriver {

	public static void main(String[] args) {
		ListGraph G = new ListGraph(7, true);
		G.addEdge(1, 2);
		G.addEdge(1, 3);
		G.addEdge(2, 5);
		G.addEdge(2, 6);
		G.addEdge(3, 4);
		G.addEdge(4, 6);
		System.out.println(G);
		for(int x : G.adj(0))
			System.out.print(x + " ");
		
		G.stackDfs(1);
		System.out.println();
		G.dfs(1);
		System.out.println();
		G.bfs(1);
	}

}
