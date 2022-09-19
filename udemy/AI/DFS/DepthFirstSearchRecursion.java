import java.util.Stack;
import java.util.List;


public class DepthFirstSearchRecursion{



	public void dfs(List<Vertex> vertexList){

		//it may happen that we have independent clusters
		for (Vertex v: vertexList ) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsHelper(v);
			}
		}
	}

	private void dfsHelper(Vertex vertex){
		//LIFO STRUCTURE
		System.out.println(vertex);

		for (Vertex v : vertex.getAdjacencyList()) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsHelper(v);
			}
		}

	}
}//end class