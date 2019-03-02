public class Pacman {

    private int cordinatex, cordinatey;

    private Direction facedDirection;

    public void setFacedDirection(Direction facedDirection) {
        this.facedDirection = facedDirection;
    }


    public void setCordinatex(int cordinatex) {
        this.cordinatex = cordinatex;
    }

    public void setCordinatey(int cordinatey) {
        this.cordinatey = cordinatey;
    }

    public int getCordinatex() {
        return cordinatex;
    }

    public int getCordinatey() {
        return cordinatey;
    }

    public Direction getFacedDirection() {
        return facedDirection;
    }
}
