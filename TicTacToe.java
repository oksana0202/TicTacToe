/**
 * JAVA 1 Homework4
 * 
 * @author Oksana
 * @version 15.11.2021
 */
 
 import java.util.Random;
 import java.util.Scanner;
 
class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = ' ';
    char [][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new TicTacToe ().game();
        int x;
        int y;
    }

    TicTacToe () {
        table = new char[3][3];
        sc = new Scanner (System.in);
        random = new Random ();
    }

    void game () {
        initTable ();
        while (true) {
            turnHuman();
            if (chekWin(SIGN_X)) {
                System.out.println ("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.print ("Sorry, DRAW!");
                break;
            }
            turnAI();
            printTable ();
            if (chekWin(SIGN_O)) {
                System.out.println ("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println ("Sorry, DRAW!");
                break;
        }
    }
        System.out.println ("GAME OVER!");
        printTable ();
}

    void initTable() {
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }

    void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
            }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Your turn x y [1..3]:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    boolean checkWin(char dot) {
    for (int i = 0; i < 3; i++)
        if ((table[i][0] == dot && table[i][1] == dot &&
            table[i][2] == dot) ||
            (table[0][i] == dot && table[1][i] == dot &&
            table[2][i] == dot))
            return true;
        if ((table[0][0] == dot && table[1][1] == dot &&
            table[2][2] == dot) ||
            (table[2][0] == dot && table[1][1] == dot &&
            table[0][2] == dot))
            return true;
            if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
            if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
}

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3)
            return false;
        }
        if (table[y][x] == SIGN_EMPTY) {
            return true;
        } else {
        return false;
        }
    }

    boolean isTableFull () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] = SIGN_EMPTY) {
                    return false;
                }
            }
        }
    return true;
    }
}
