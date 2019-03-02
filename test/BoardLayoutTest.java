import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardLayoutTest {

    private static int dimensionx, dimensiony;
    private static Pacman pacman;

    @BeforeAll
    static void beforeAll() {
        dimensionx = 5;
        dimensiony = 5;
        pacman = new Pacman();
        pacman.setCordinatex(3);
        pacman.setCordinatey(3);
        pacman.setFacedDirection(Direction.NORTH);
    }


    @Test
    void place() {

        assertNotNull(pacman);
        pacman.setCordinatex(2);
        pacman.setCordinatey(2);
        pacman.setFacedDirection(Direction.EAST);
        assertTrue(pacman.getCordinatex() < dimensionx);
        assertTrue(pacman.getCordinatex() > 0);
        assertTrue(pacman.getCordinatey() < dimensiony);
        assertTrue(pacman.getCordinatey() > 0);
        assertEquals(pacman.getCordinatex(), 2);
        assertEquals(pacman.getCordinatey(), 2);
        assertEquals(pacman.getFacedDirection(), Direction.EAST);
    }

    @Test
    void move() {
        assertNotNull(pacman);
        pacman.setCordinatey(pacman.getCordinatey() + 1);
        assertTrue(pacman.getCordinatey() < 5);
        assertTrue(pacman.getCordinatey() > 0);
        assertEquals(pacman.getCordinatey(), 4);



    }

    @Test
    void left() {
        assertNotNull(pacman);
        pacman.setFacedDirection(Direction.WEST);

        assertEquals(pacman.getFacedDirection(), Direction.WEST);
    }

    @Test
    void right() {
        assertNotNull(pacman);
        pacman.setFacedDirection(Direction.EAST);

        assertEquals(pacman.getFacedDirection(), Direction.EAST);
    }

    @Test
    void report() {
        assertNotNull(pacman);
    }
}