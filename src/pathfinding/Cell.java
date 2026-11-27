package pathfinding;

import java.util.Objects;

public class Cell {
    private final int row;
    private final int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    @Override
    public int hashCode(){return Objects.hash(row,col);}
    @Override
    public String toString() {return "("+row+", "+col+")";}
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cell) {
            Cell otherCell = (Cell) obj;
            return this.row == otherCell.row &&
                    this.col == otherCell.col;
        }return false;
    }
}
