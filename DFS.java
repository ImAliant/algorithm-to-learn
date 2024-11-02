import java.util.List;

public class DFS {
	public static void dfsRec(int node, List<List<Integer>> adj, boolean[] visited) {
		visited[node] = true;

		for (int i : adj.get(node)) {
			if (!visited[i]) {
				dfsRec(i, adj, visited);
			}
		}
	}

	public static void dfs(int node, List<List<Integer>> adj) {
		boolean[] visited = new boolean[adj.size()];
		dfsRec(node, adj, visited);
	}
}
