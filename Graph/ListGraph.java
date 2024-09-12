package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListGraph implements Graph {
	int size;
	boolean directed;
	LinkedList<Integer>[] adj;

	
	@SuppressWarnings("unchecked")
	public ListGraph(int size, boolean directed) {
		this.size = size;                  //vertex 수
		this.directed = directed;          //true: 방향성 그래프, false: 무방향성 그래프
		adj = new LinkedList[size];
		for(int i = 0; i < size; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void addEdge(int v, int w) {
		adj[v].add(w);
		if(!directed)
			adj[w].add(v);
	}


	@Override
	public Iterable<Integer> adj(int v) {
		return adj[v];
	}
	
	public void dfs(int v, boolean[] visited) {
		if(visited[v]) return;
		
		visited[v] = true;
		System.out.print(v + " ");
		
		for(int i: adj[v]) {
			if(!visited[i]) {
				dfs(i, visited);
			}
		}
	}
	
	public void dfs(int start) {
		boolean[] visited = new boolean[size];
		dfs(start, visited);
	}
	
	public void stackDfs(int start) {
		boolean[] visited = new boolean[size];
		Stack<Integer> stack = new Stack<>();
		
		stack.push(start);
		while(!stack.isEmpty()) {
			int v = stack.pop();
			visited[v] = true;
			System.out.print(v + " ");
			
			for(int i : adj[v]) {
				if(!visited[i]) {
					stack.push(i);
				}
			}
		}
	}
	
	public void bfs(int start) {
	    boolean[] visited = new boolean[size];
	    Queue<Integer> queue = new LinkedList<>();

	    visited[start] = true;
	    queue.add(start);

	    while (!queue.isEmpty()) {
	        int v = queue.poll();
	        System.out.print(v + " ");

	        for (int i : adj(v)) {
	            if (!visited[i]) {
	                visited[i] = true;
	                queue.add(i);
	            }
	        }
	    }
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			sb.append(i).append(" -> (");
			for(int k: adj[i])
				sb.append(k).append(" ");
			sb.append(")\n");
		}
		return sb.toString();
	}

}
