package pathfinding;

import java.util.ArrayList;
import java.util.List;

public class Path {

    private final List<Cell> cells;

    public Path(List<Cell> cells) {
        this.cells = new ArrayList<>(cells);
    }

    public List<Cell> getCells() {
        return cells;
    }

    public boolean isFound() {
        return !cells.isEmpty();
    }

    public int getLength() {
        return cells.size();
    }
}