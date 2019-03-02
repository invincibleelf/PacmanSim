import java.util.InputMismatchException;

public class BoardLayout {

    private int dimensionx, dimensiony;

    private Pacman pacman;


    public BoardLayout() {
        initBoardLayout();
    }

    /*
     * Init Board grid with dimension 5 * 5
     * */
    public void initBoardLayout() {
        this.dimensionx = 5;
        this.dimensiony = 5;

        pacman = new Pacman();
    }

    /*
     * Method to put Pacman on the board grid
     * @param x y Coordinates for pacman placement
     *        d Direction as NORTH, SOUTH, EAST and WEST
     * @return null
     * */
    public void place(int x, int y, String d) throws IllegalMoveException {

        Direction direction = Direction.valueOf(d.toUpperCase());

        if (Utils.validateBoard(x, y, dimensionx, dimensiony)) {
            pacman.setCordinatex(x);
            pacman.setCordinatey(y);
            pacman.setFacedDirection(direction);
        } else {
            throw new IllegalMoveException("Cannot place pacman out of the grid");
        }


    }

    /*
     * Method to move Pacman on the board grid
     * @param null
     * @return null
     * */
    public void move() throws IllegalMoveException {

        switch (pacman.getFacedDirection()) {
            case EAST:
                if (Utils.validateMove(pacman.getCordinatex() + 1, dimensionx)) {

                    System.out.println("Moving Pacman East");
                    pacman.setCordinatex(pacman.getCordinatex() + 1);


                } else {
                    throw new IllegalMoveException("Move is invalid as pacman will move out of grid");
                }
                break;
            case WEST:
                if (Utils.validateMove(pacman.getCordinatex() - 1, dimensionx)) {

                    System.out.println("Moving Pacman West");
                    pacman.setCordinatex(pacman.getCordinatex() - 1);

                } else {
                    throw new IllegalMoveException("Move is invalid as pacman will move out of grid");
                }
                break;
            case NORTH:
                if (Utils.validateMove(pacman.getCordinatey() + 1, dimensiony)) {

                    System.out.println("Moving Pacman North");
                    pacman.setCordinatey(pacman.getCordinatey() + 1);

                } else {
                    throw new IllegalMoveException("Move is invalid as pacman will move out of grid");
                }
                break;
            case SOUTH:
                if (Utils.validateMove(pacman.getCordinatey() - 1, dimensiony)) {
                    System.out.println("Moving Pacman South");
                    pacman.setCordinatey(pacman.getCordinatey() - 1);

                } else {
                    throw new IllegalMoveException("Move is invalid as pacman will move out of grid");
                }
                break;

        }
    }

    /*
     * Method to rotate Pacman 90 degrees left
     * @param null
     * @return null
     * */
    public void left() {

        switch (pacman.getFacedDirection()) {
            case EAST:
                pacman.setFacedDirection(Direction.NORTH);
                break;
            case WEST:
                pacman.setFacedDirection(Direction.SOUTH);
                break;
            case NORTH:
                pacman.setFacedDirection(Direction.WEST);
                break;
            case SOUTH:
                pacman.setFacedDirection(Direction.EAST);
                break;
        }
    }

    /*
     * Method to rotate Pacman 90 degrees right
     * @param null
     * @return null
     * */
    public void right() {

        switch (pacman.getFacedDirection()) {
            case EAST:
                pacman.setFacedDirection(Direction.SOUTH);
                break;
            case WEST:
                pacman.setFacedDirection(Direction.NORTH);
                break;
            case NORTH:
                pacman.setFacedDirection(Direction.EAST);
                break;
            case SOUTH:
                pacman.setFacedDirection(Direction.WEST);
                break;
        }
    }

    /*
     * Method to report Pacman location on the grid
     * @param null
     * @return null
     * */
    public void report() {
        System.out.println("Pacman Location coordinate (x,y) is (" + pacman.getCordinatex() + "," + pacman.getCordinatey() + ") and faced direction is " + pacman.getFacedDirection());
    }

}
