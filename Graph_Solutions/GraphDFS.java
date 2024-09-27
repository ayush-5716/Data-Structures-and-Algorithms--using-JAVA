import java.util.*;
class GraphDFS{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		graph.add(new ArrayList<Integer>());
		graph.get(0).add(1);
		graph.get(0).add(4);
		graph.add(new ArrayList<Integer>());
		graph.get(1).add(0);
		graph.get(1).add(4);
		graph.get(1).add(2);
		graph.add(new ArrayList<Integer>());
		graph.get(2).add(1);
		graph.get(2).add(4);
		graph.get(2).add(3);
		graph.add(new ArrayList<Integer>());
		graph.get(3).add(4);
		graph.get(3).add(2);
		graph.add(new ArrayList<Integer>());
		graph.get(4).add(0);
		graph.get(4).add(1);
		graph.get(4).add(2);
		graph.get(4).add(3);
		DFS(graph, start, new int[graph.size()]);
		
		
	}
	
	public static void DFS(ArrayList<ArrayList<Integer>> graph, int edge, int[] visited){
		
		if( visited[edge] == 1  ) return;
		else{
			System.out.println(edge);
			visited[edge] = 1;
			ArrayList<Integer> ls = graph.get(edge);
			for( int i=0 ;i < ls.size(); i++){
				if(visited[ls.get(i)] != 1){
					DFS(graph, ls.get(i), visited);
				}
			} 
		}
		
	}
	
	
}