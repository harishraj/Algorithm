/*
 ==========================================================
 Author : Hyogi Jung(hyogij@gmail.com)
 Date : 2016.03.10
 Problem : http://buttercola.blogspot.kr/2015/08/leetcode-graph-valid-tree.html
 https://leetcode.com/discuss/54211/ac-java-solutions-union-find-bfs-dfs
 ==========================================================
 */
public class Solution {
	/*
	 * Given n nodes labeled from 0 to n - 1 and a list of undirected edges
	 * (each edge is a pair of nodes), write a function to check whether these
	 * edges make up a valid tree. 
	 * 
	 * For example: 
	 * Given n = 5 and edges = [[0, 1], [0, 2], [0, 3], [1, 4]], return true. 
	 * Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]], return false. 
	 * 
	 * Hint: 
	 * Given n = 5 and edges = [[0, 1], [1, 2], [3, 4]], what should your return? 
	 * Is this case a valid tree? 
	 * According to the definition of tree on Wikipedia: "a tree is an undirected graph 
	 * in which any two vertices are connected by exactly one path. In other words, 
	 * any connected graph without simple cycles is a tree."
	 * 
	 * Note: you can assume that no duplicate edges will appear in edges.
	 * Since all edges are undirected, [0, 1] is the same as [1, 0] and thus
	 * will not appear together in edges.
	 */
	public static void main(String[] args) {
		int n = 5;
		int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
		System.out.println("validTree : " + validTree(n, edges));
		
	}

	public static boolean validTree(int n, int[][] edges) {
		// Graph�� Tree�� ���� ū ���̴� Cycle ���� �����̴�
		// Tree�� Cycle�� ����, Graph�� ���� �� �ִ�
		// �ش� ���� edges�� �̿��Ͽ� Graph�� ���� ��, cycle ������ �����Ѵ�
		// Cycle ������ DFS�� �湮�Ͽ�, �̹� visited�� ��带 ������ cycle �� �����ϴ� ���̴� 
		// �̰� undirected graph�� cycle ������ ã�� �Ͱ� �����ϰ�
		// directed graph��?
		// Graph �� ��� ���� �� �� ����? DFS �߿��� �̹� ���� �� ������ �ȵȴ� 
		// tree : graph �̸鼭 fully connected �̰� no cycle 
		return true;
	}
	

}