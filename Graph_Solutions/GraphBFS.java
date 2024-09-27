import java.util.*;
class GraphBFSDFS{

	public static void main(String args[]){
		
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
		
		BFS(graph , 0);
		
	}	

		public static void BFS(ArrayList<ArrayList<Integer>> graph, int node){
			
			int[] visited = new int[graph.size()];
			Queue<Integer> que = new LinkedList<>();
			que.add(0);
			
			while(!que.isEmpty()){
				int edge = que.poll();
				if( visited[edge] != 1){
					System.out.println( edge );
					visited[edge] = 1;
					ArrayList<Integer> ls = graph.get(edge);
					for(int i=0 ;i < ls.size(); i++){
						if( visited[ls.get(i)] != 1) que.add(ls.get(i));
					}
				}
			}
			
			
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