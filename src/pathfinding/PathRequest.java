package pathfinding;

public class PathRequest {

    private final Grid grid;
    private final Cell start;
    private final Cell goal;

    public PathRequest(Grid grid, Cell start, Cell goal) {
        if (!grid.isWalkable(start)) {
            throw new RuntimeException("Invalid start position");
        }
        if (!grid.isWalkable(goal)) {
            throw new RuntimeException("Invalid goal position");
        }
        this.grid = grid;
        this.start = start;
        this.goal = goal;
    }

    public Grid getGrid() {
        return grid;
    }

    public Cell getStart() {
        return start;
    }

    public Cell getGoal() {
        return goal;
    }
}