public class MazeSolver{

	private int[][] maze;
	private boolean[][] visited;

	private int startRow;
	private int startCol;

	public MazeSolver(int [][] maze, int startRow, int startCol){
		this.maze = maze;
		this.visited = new boolean[maze.length][maze.length];
		this.startRow = startRow;
		this.startCol = startCol;
	}

	public void findWay(){
		if (dfs(startRow, startCol)) {
			System.out.println("Solution exists.");
		}else {
			System.out.println("No solution exists.");
		}
	}

	private boolean isFeasible(int x, int y){
		if (x < 0 || x > maze.length-1) {
			return false;
		}

		if (y < 0 || y > maze.length-1) {
			return false;
		}

		if (visited[x][y]) {
			return false;
		}

		if (maze[x][y] == 1) {
			return false;
		}

		return true;
	}

	private boolean dfs(int x, int y){

		//base case 
		if (x == maze.length-1 && y == maze.length-1) {
			return true;
		}
		if (isFeasible(x,y)) {

			visited[x][y] = true;

			//going down
			if (dfs(x+1,y)) {
				return true;
			}
			//going up
			if (dfs(x-1,y)) {
				return true;
			}

			//going to the right
			if (dfs(x,y+1)) {
				return true;
			}
			//go left
			if (dfs(x,y-1)) {
				return true;
			}

			//backtrack
			visited[x][y] = false;
			return false;
		}

		return false;
	}

}//end class






