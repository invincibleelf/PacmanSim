public class Utils {

    /*
    * Validate pacman location on the board
    * @param x x-coordinate of pacman
    *       y y-coordinate of pacman
    *       dx x-axis length of board
    *       dy y-axis length of board
    * @return boolean
    * */
    public static boolean validateBoard(int x, int y, int dx, int dy) {

        if (x > dx || y > dy) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Validate pacman move on the board
     * @param x x-coordinate or y-cordinate of pacman
     *        dx x-axis or y-axis length of board
     *
     * @return boolean
     * */
    public static boolean validateMove(int x, int d){
        if(x < 0 || x > d){
            return false;
        }else {
            return true;
        }
    }
}
