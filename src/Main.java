import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pos1 = 1;
        String strPos1 = "1";
        int pos2 = 2;
        String strPos2 = "2";
        int pos3 = 3;
        String strPos3 = "3";
        int pos4 = 4;
        String strPos4 = "4";
        int pos5 = 5;
        String strPos5 = "5";
        int pos6 = 6;
        String strPos6 = "6";
        int pos7 = 7;
        String strPos7 = "7";
        int pos8 = 8;
        String strPos8 = "8";
        int pos9 = 9;
        String strPos9 = "9";

        System.out.println("WELCOME TO TIC TAC TOE");
        System.out.println("~ ~ ~ ~ ~");
        System.out.println("");

        System.out.println(strPos1 + " | " + strPos2 + " | " + strPos3);
        System.out.println("---------");
        System.out.println(strPos4 + " | " + strPos5 + " | " + strPos6);
        System.out.println("---------");
        System.out.println(strPos7 + " | " + strPos8 + " | " + strPos9);


        int counter = 0;

        while ((!(strPos1 == strPos2 && strPos2 == strPos3) && !(strPos4 == strPos5 && strPos5 == strPos6) &&
                !(strPos7 == strPos8 && strPos8 == strPos9) && !(strPos1 == strPos4 && strPos4 == strPos7) &&
                !(strPos2 == strPos5 && strPos5 == strPos8) && !(strPos3 == strPos6 && strPos6 == strPos9) &&
                !(strPos1 == strPos5 && strPos5 == strPos9) && !(strPos3 == strPos5 && strPos5 == strPos7)) && counter <= 4) {

            System.out.println("Pick your position");
            System.out.println("Player 1: ");
            int play1pos1 = scanner.nextInt();
            scanner.nextLine();

            if (play1pos1 == pos1) {
                strPos1 = "X";
            } else if (play1pos1 == pos2) {
                strPos2 = "X";
            } else if (play1pos1 == pos3) {
                strPos3 = "X";
            } else if (play1pos1 == pos4) {
                strPos4 = "X";
            } else if (play1pos1 == pos5) {
                strPos5 = "X";
            } else if (play1pos1 == pos6) {
                strPos6 = "X";
            } else if (play1pos1 == pos7) {
                strPos7 = "X";
            } else if (play1pos1 == pos8) {
                strPos8 = "X";
            } else if (play1pos1 == pos9) {
                strPos9 = "X";
            }

            System.out.println(strPos1 + " | " + strPos2 + " | " + strPos3);
            System.out.println("---------");
            System.out.println(strPos4 + " | " + strPos5 + " | " + strPos6);
            System.out.println("---------");
            System.out.println(strPos7 + " | " + strPos8 + " | " + strPos9);

            if (counter != 4) {
                System.out.println("Pick your position");
                System.out.println("Player 2: ");
                int play2pos1 = scanner.nextInt();
                scanner.nextLine();

                if (play2pos1 == pos1) {
                    strPos1 = "O";
                } else if (play2pos1 == pos2) {
                    strPos2 = "O";
                } else if (play2pos1 == pos3) {
                    strPos3 = "O";
                } else if (play2pos1 == pos4) {
                    strPos4 = "O";
                } else if (play2pos1 == pos5) {
                    strPos5 = "O";
                } else if (play2pos1 == pos6) {
                    strPos6 = "O";
                } else if (play2pos1 == pos7) {
                    strPos7 = "O";
                } else if (play2pos1 == pos8) {
                    strPos8 = "O";
                } else if (play2pos1 == pos9) {
                    strPos9 = "O";
                }

                System.out.println(strPos1 + " | " + strPos2 + " | " + strPos3);
                System.out.println("---------");
                System.out.println(strPos4 + " | " + strPos5 + " | " + strPos6);
                System.out.println("---------");
                System.out.println(strPos7 + " | " + strPos8 + " | " + strPos9);
            }

            counter++;
            System.out.println("counter: " + counter);
        }

        if (((strPos1 == strPos2 && strPos2 == strPos3) || (strPos4 == strPos5 && strPos5 == strPos6) ||
                (strPos7 == strPos8 && strPos8 == strPos9) || (strPos1 == strPos4 && strPos4 == strPos7) ||
                (strPos2 == strPos5 && strPos5 == strPos8) || (strPos3 == strPos6 && strPos6 == strPos9) ||
                (strPos1 == strPos5 && strPos5 == strPos9) || (strPos3 == strPos5 && strPos5 == strPos7)) && (strPos1 == "X" ||
                strPos3 == "X" || strPos5 == "X" || strPos7 == "X" || strPos9 == "X")) {
            System.out.println("Player 1 WINS");
        } else if (((strPos1 == strPos2 && strPos2 == strPos3) || (strPos4 == strPos5 && strPos5 == strPos6) ||
                (strPos7 == strPos8 && strPos8 == strPos9) || (strPos1 == strPos4 && strPos4 == strPos7) ||
                (strPos2 == strPos5 && strPos5 == strPos8) || (strPos3 == strPos6 && strPos6 == strPos9) ||
                (strPos1 == strPos5 && strPos5 == strPos9) || (strPos3 == strPos5 && strPos5 == strPos7)) && (strPos1 == "O" ||
                strPos3 == "O" || strPos5 == "O" || strPos7 == "O" || strPos9 == "O")) {
            System.out.println("Player 2 WINS");
        } else {
            System.out.println("STALEMATE");
        }
    }
}