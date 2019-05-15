/**
 * Created by manuelhernandez on 8/30/17.
 */
import java.util.*;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {

        boolean repeat = true;
        while (repeat = true) {
            Battleship grid = new Battleship();
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter you Coordinate");
            String input = keyboard.nextLine();


/*
parsing and interpretes user input
 */
            //(5,5) format
            if (input.charAt(0) == '(') {
                int x = (input.charAt(1) - 48);
                int y = (input.charAt(3) - 48);
                System.out.println(x);
                System.out.println(y);
                grid.edgeAdj(x, y);
                grid.cornerAdj(x, y);
                grid.showNonAdj();
                grid.resetGameBoard();
            }

            //4,1 format
            if (input.charAt(1) == ',') {
                int x = (input.charAt(0)) - 48;
                int y = (input.charAt(2)) - 48;
                grid.edgeAdj(x, y);
                grid.cornerAdj(x, y);
                grid.showNonAdj();
                grid.resetGameBoard();
            }
            //1 0 format(with " " space between chars)
            if (input.charAt(1) == ' ' && input.charAt(0) < 58 && input.charAt(0) > 47) {
                int x = (input.charAt(0)) - 48;
                int y = (input.charAt(2)) - 48;
                grid.edgeAdj(x, y);
                grid.cornerAdj(x, y);
                grid.showNonAdj();
                grid.resetGameBoard();
            }
            //a 7 format(with a ' ' space in between the chars)
            if (input.charAt(1) == ' ' && input.charAt(0) < 123 && input.charAt(0) > 96) {
                int x = (input.charAt(0)) - 'a';
                int y = (input.charAt(2)) - 48;
                grid.edgeAdj(x, y);
                grid.cornerAdj(x, y);
                grid.showNonAdj();
                grid.resetGameBoard();
            }
            //c4 format
            if (input.charAt(0) < 123 && input.charAt(0) > 96 && input.charAt(1) < 58 && input.charAt(1) > 47) {
                int x = (input.charAt(0)) - 'a';
                int y = (input.charAt(1)) - 48;
                grid.edgeAdj(x, y);
                grid.cornerAdj(x, y);
                grid.showNonAdj();
                grid.resetGameBoard();
            } else {

                System.out.println("Sorry I can only take Strings in:" +
                        " (5,5) format" +
                        "4,1 format" +
                        "1 0 format(with \" \" space between chars)" +
                        "a 7 format(with a ' ' space in between the chars)" +
                        "c4 format");
            }

            System.out.println("Would you like to select another square? Enter yes or no");
            String key;
            key = keyboard.nextLine();
            if (key.charAt(0) == 121) {
                repeat = true;
            }
            if (key.charAt(0) == 110) {
                repeat = false;

            }
        }
    }
    }
