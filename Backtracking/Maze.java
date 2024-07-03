public class Maze {
    public static void printMaze(int sol[][]) {
        for(int i=0; i<sol.length; i++) {
            for(int j=0; j<sol.length; j++) {
                System.out.print(" "+sol[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int x, int y) {
        if(x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1) {
            return true;
        }
        return false;
    }

    public static boolean mazeSolver(int maze[][]) {
        int n = maze.length;
        int sol[][] = new int[n][n];
        if(mazeSolverUntil(maze, 0, 0, sol) == false) {
            System.out.println("solution doesn't exist");
            return false;
        }

        printMaze(sol);
        return true;

    }

    public static boolean mazeSolverUntil(int maze[][], int x, int y, int sol[][]) {
        if(x == maze.length-1 && y == maze.length-1) {
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(maze, x, y) == true) {
            sol[x][y] = 1;
            if(mazeSolverUntil(maze, x+1, y, sol)) {
                return true;
            }
            if(mazeSolverUntil(maze, x, y+1, sol)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1}};
                        mazeSolver(maze);
    }
}
