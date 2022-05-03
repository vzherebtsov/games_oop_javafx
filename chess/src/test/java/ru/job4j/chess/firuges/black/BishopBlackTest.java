package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell ps = bishopBlack.position();
        assertEquals(Cell.C8, ps);
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure ps = bishopBlack.copy(Cell.H6);
        assertEquals(Cell.H6, ps.position());
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, rsl);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void isDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.F2);
    }
}