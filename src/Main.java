import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BoardLayout board = new BoardLayout();

        System.out.println("Welcome to Pacman Simulator. Your initial pacman position is (0, 0) facing NORTH direction");

        while (true) {

            try {
                Scanner scanner = new Scanner(System.in);
                initSteps();

                int i;
                do {

                    i = scanner.nextInt();

                    switch (i) {
                        //Case 1 is for placing pacman in the board
                        case 1:
                            System.out.println("Please choose coordinates as integer value and faced direction");
                            System.out.println("Example: 0 0 NORTH");
                            initPlace(scanner, board);
                            break;
                        //Case 2 is for moving pacman forward one step towards the faced direction
                        case 2:
                            board.move();
                            board.report();
                            break;
                        //Case 3 is for rotating pacman  90 degrees left
                        case 3:

                            board.left();
                            board.report();
                            break;
                        //Case 4 is for rotating pacman  90 degrees right
                        case 4:

                            board.right();
                            board.report();
                            break;
                        //Case 5 is for displaying  current location of pacman
                        case 5:
                            board.report();
                            break;
                        //Case 0 for existing pacman game
                        case 0:
                            System.out.println("Exiting Pacman Simulation");
                            break;
                        default:
                            System.out.println("Please choose the integer values from displayed categories");
                            break;


                    }

                    System.out.println();


                } while (i != 0);

                System.out.println("Thank you for playing Pacman Simulation");
                break;


            } catch (IllegalMoveException e) {
                System.out.println(e.getMessage());
                board.report();

            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch : Please put coordinates as integer value between 0 and 5");

            } catch (IllegalArgumentException e) {
                System.out.println("Illegal Argument : Please put direction as NORTH, SOUTH, EAST OR WEST");
            } catch (NullPointerException e) {
                System.out.println("First place pacman on the board");
            }
        }

    }

    public static void initPlace(Scanner scanner, BoardLayout board) throws IllegalMoveException {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String direction = scanner.nextLine().trim();

        System.out.println("Given coordinates and direction are " + x + "  " + y + " " + direction);

        board.place(x, y, direction);
        board.report();
    }

    public static void initSteps() {
        System.out.println();
        System.out.println("Choose what to do with your Pacman entering respective integer value");
        System.out.println("1. PLACE PACMAN IN GRID");
        System.out.println("2. MOVE FORWARD");
        System.out.println("3. ROTATE LEFT");
        System.out.println("4. ROTATE RIGHT");
        System.out.println("5. REPORT PACMAN POSITION");
        System.out.println("0. EXIT");
    }
}
