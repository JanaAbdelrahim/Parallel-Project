package pathfinding;
public class Grid {

    private final boolean[][] grid;
    private final int rows;
    private final int cols;
    private Cell start;
    private Cell goal;

    public Grid(boolean[][] grid) {
        if (grid==null || grid.length==0) {
            throw new RuntimeException("Grid cannot be empty");
        }

        if (grid[0]==null || grid[0].length==0) {
            throw new RuntimeException("Grid cannot have empty rows");
        }

        rows = grid.length;
        cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            if (grid[i] == null || grid[i].length != cols) {
                throw new RuntimeException("Grid must be rectangular");
            }
        }

        this.grid = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            this.grid[i] = grid[i].clone();
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Cell getStart() {
        return start;
    }

    public Cell getGoal() {
        return goal;
    }

    public boolean isValid(Cell cell) {
        return cell.getRow() >= 0 && cell.getRow() < rows &&  cell.getCol() >= 0 && cell.getCol() < cols;
    }

    public boolean isWalkable(Cell cell) {
        if (!isValid(cell)) {
            return false;
        }
        return grid[cell.getRow()][cell.getCol()];
    }

//    public void printGrid() {
//        for (int i=0;i<rows;i++) {
//            for (int j=0;j<cols;j++) {
//                if (grid[i][j]) System.out.print(". ");
//                 else System.out.print("# ");
//            }
//            System.out.println();
//        }
//    }

    public void setStart(Cell start) {
        if (!isWalkable(start)) {
            throw new RuntimeException("Invalid start position");
        }
        this.start = start;
    }

    public void setGoal(Cell goal) {
        if (!isWalkable(goal)) {
            throw new RuntimeException("Invalid goal position");
        }
        this.goal = goal;
    }


}
