package models;

import org.junit.jupiter.api.Test;
import sudoku.model.solver.BacktrackingSudokuSolver;
import sudoku.model.models.SudokuBoard;
import static org.junit.jupiter.api.Assertions.*;

public class TejveerCustomTest {

    @Test
    public void testBoardIsInitiallyEmpty() {
        SudokuBoard board = new SudokuBoard(new BacktrackingSudokuSolver());
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                assertEquals(0, board.getField(col, row).getValue());
            }
        }
    }

    @Test
    public void testSudokuBoardEqual() {
        SudokuBoard b1 = new SudokuBoard(new BacktrackingSudokuSolver());
        SudokuBoard b2 = new SudokuBoard(new BacktrackingSudokuSolver());
        
        assertEquals(b1, b2);
        
        b1.setField(0, 0, 7);
        
        assertNotEquals(b1, b2);
        b2.setField(0, 0, 7);
        assertEquals(b1, b2);
    }

}