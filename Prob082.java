import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Node implements Comparable{
	int value;
	
	int x;
	int y;
	
	Node(int value, int x, int y) {
		this.value = value;
		this.x = x;
		this.y = y;
	}
	
	public int hashCode() {
		return 100*x + y;
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o instanceof Node) {
			Node n = (Node)o;
			if (n.x == x && n.y == y && n.value == value) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	public String toString() {
	return "(" + x + ", " + y + ")" + "(" + value + ")";
	}
	
	public int compareTo(Object o) {
		Node n = (Node)o;
		
		return this.value - n.value;
	}
	
}

class Prob082 {
	
	/*
	 * Takes two nodes, the source and destination
	 * The original graph
	 * And the size of the graph
	 * And returns the shortest distance between the source and destination
	 */
	static int shortestDistance(Node source, Node destination, Node[][] original, int size) {
		
		Node[][] tentative = new Node[size][size];
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		Set<Node> visited = new HashSet<Node>();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				tentative[i][j] = new Node(Integer.MAX_VALUE, i, j);
			}
		}
		
		tentative[source.x][source.y].value = source.value;
		
		pq.add(source);
		Node s = null;
		
		// While we have no more nodes to process OR
		// We have reached the destination
		while (pq.size() != 0 && !destination.equals(s)) {
			s = pq.poll();
			if (!visited.contains(s)) {
				// Node directly above
				if (s.x > 0 && !visited.contains(tentative[s.x - 1][s.y])) {
					tentative[s.x - 1][s.y].value = Math.min(tentative[s.x - 1][s.y].value, s.value + original[s.x - 1][s.y].value);
					pq.add(tentative[s.x - 1][s.y]);
				}
				
				// Node directly below
				if (s.x < size - 1 && !visited.contains(tentative[s.x + 1][s.y])) {
					tentative[s.x + 1][s.y].value = Math.min(tentative[s.x + 1][s.y].value, s.value + original[s.x + 1][s.y].value);
					pq.add(tentative[s.x + 1][s.y]);
				}
				
				// Node to the right
				if (s.y < size - 1 && !visited.contains(tentative[s.x][s.y + 1])) {
					tentative[s.x][s.y + 1].value = Math.min(tentative[s.x][s.y + 1].value, s.value + original[s.x][s.y + 1].value);
					pq.add(tentative[s.x][s.y + 1]);
				}
				visited.add(s);
			}
		}
		return tentative[destination.x][destination.y].value;
	}
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("p082_matrix.txt"));
		
		int n = 80;
		int[][] values = new int[n][n];
		Node[][] nodes = new Node[n][n];
		
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(",");
			for (int j = 0; j < n; j++) {
				values[i][j] = Integer.parseInt(s[j]);
				nodes[i][j] = new Node(values[i][j], i, j);
			}
		}
		
		Set<Integer> pathVals = new TreeSet<Integer>();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//System.out.println(shortestDistance(nodes[i][0], nodes[j][n - 1], nodes, n));
				pathVals.add(shortestDistance(nodes[i][0], nodes[j][n - 1], nodes, n));
			}
		}
		System.out.println(pathVals.iterator().next());
	}
}