/**
 * Created by manuelhernandez on 8/30/17.
 */
public class Battleship {

    static int[][] grid = new int[9][9];
    int xCor;
    int yCor;

    public Battleship() {

    }

    /*method that prints out the edge adjacent square
    (checks to see if numbers will fit in array)
    *then sets the corresponding int array to 1
     */
    public void edgeAdj(int x, int y) {
        xCor = x;
        yCor = y;


        grid[xCor][yCor] = 1;
        System.out.println("Selected Square:["+x+"],["+y+"]");
        System.out.println("Edge Adjacent Squares:");
        if ((xCor - 1) >= 0) {
            System.out.println(" [" + (xCor - 1) + "," + (yCor) + "]");
            grid[xCor - 1][yCor] = 1;
        }
        if ((xCor + 1) < 9) {
            System.out.println(" [" + (xCor + 1) + "," + (yCor) + "]");
            grid[xCor + 1][yCor] = 1;
        }
        if ((yCor - 1) >= 0) {
            System.out.println(" [" + (xCor) + "," + (yCor - 1) + "]");
            grid[xCor][yCor - 1] = 1;
        }
        if ((yCor + 1) < 9) {
            System.out.println(" [" + (xCor) + "," + (yCor + 1) + "] ");
            grid[xCor][yCor + 1] = 1;
        }


    }
     /*
      method that prints out corner adjacent squares
      method checks sto see if corner adjacent square is in the scope of the array
      then changes the corner adjacent to 1
 */
    public void cornerAdj(int x, int y) {
        xCor = x;
        yCor = y;

        System.out.println(" Corner Adjacent Squares:");
        if ((xCor - 1) >= 0 && ((yCor - 1) >= 0)) {
            System.out.println(" [" + (xCor - 1) + "," + (yCor - 1) + "]");
            grid[xCor - 1][yCor - 1] = 1;

        }
        if ((xCor + 1) < 9 && (yCor + 1) < 9) {
            System.out.println(" [" + (xCor + 1) + "," + (yCor + 1) + "]");
            grid[xCor + 1][yCor + 1] = 1;
        }
        if ((xCor - 1) >= 0 && ((yCor + 1) < 9)) {
            System.out.println(" [" + (xCor - 1) + "," + (yCor + 1) + "]");
            grid[xCor - 1][yCor + 1] = 1;
        }
        if ((xCor + 1) < 9 && ((yCor - 1) >= 0)) {
            System.out.println(" [" + (xCor + 1) + "," + (yCor - 1) + "]");
            grid[xCor + 1][yCor - 1] = 1;
        }
/*
method that prints out all non adjacent squares
uses nested for loop to search for array elements not equal to 1
then prints them out
 */

    }

    public void showNonAdj() {

        System.out.println("Non-Adjacent Squares");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] != 1)
                    System.out.println("[" + i + "," + j + "]");

            }
        }


    }
/*
method populates the 2d grid array with all zeros
 */
    public void resetGameBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = 0;


            }

        }

    }


}
