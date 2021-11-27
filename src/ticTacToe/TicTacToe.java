package ticTacToe;

import java.util.Scanner;

public class TicTacToe {

    /*
Написать игру крестики нолики (двумерный массив размерностью 3х3).
1. Не используя классы и методы - все в методе main
2. Не используя утильные классы (Arrays и Math)
3. Игра должна продолжаться до тех пор, пока не будет
выявлен победитель (три "О" или три "Х" в ряд или по диагонали)
или пока не закончатся свободные клетки
 */

    public static void main(String[] args) {

        String [][] game = new String[3][3];
        int col=0;
        int flag = 1;
        boolean name = true;
        int value = 0;

        System.out.println("Это игра крестики-нолуки!");
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                value++;
                game[i][j] = Integer.toString(value);
                System.out.print("|" + game[i][j] + "|");
            }
            System.out.println();
        }

        while (col < 9){
            if (col > 0){
                for (int i = 0; i < game.length; i++) {
                    for (int j = 0; j < game[i].length; j++) {
                        System.out.print("|" + game[i][j] + "|");
                    }
                    System.out.println();
                }
            }
            if (col>4) {
                switch (game[1][1]) {
                    case "O":
                        switch (game[0][1]) {
                            case "O":
                                if (game[2][1] == "O") {
                                    System.out.println("Победил O!!!");
                                    return;
                                }
                            case "X":
                                break;
                        }
                        switch (game[0][2]) {
                            case "O":
                                if (game[2][0] == "O") {
                                    System.out.println("Победил O!!!");
                                    return;
                                }
                            case "X":
                                break;
                        }
                        switch (game[1][2]) {
                            case "O":
                                if (game[1][0] == "O") {
                                    System.out.println("Победил O!!!");
                                    return;
                                }
                            case "X":
                                break;
                        }
                        switch (game[2][0]) {
                            case "O":
                                if (game[0][0] == "O") {
                                    System.out.println("Победил O!!!");
                                    return;
                                }
                            case "X":
                                break;
                        }
                        break;
                    case "X":
                        switch (game[0][1]) {
                            case "X":
                                if (game[2][1] == "X") {
                                    System.out.println("Победил X!!!");
                                    return;
                                }
                            case "O":
                                break;
                        }
                        switch (game[0][2]) {
                            case "X":
                                if (game[2][0] == "X") {
                                    System.out.println("Победил X!!!");
                                    return;
                                }
                            case "O":
                                break;
                        }
                        switch (game[1][2]) {
                            case "X":
                                if (game[1][0] == "X") {
                                    System.out.println("Победил X!!!");
                                    return;
                                }
                            case "O":
                                break;
                        }
                        switch (game[2][2]) {
                            case "X":
                                if (game[0][0] == "X") {
                                    System.out.println("Победил X!!!");
                                    return;
                                }
                            case "O":
                                break;
                        }
                        break;
                    default:
                        break;
                }
                switch (game[2][0]) {
                    case "O":
                        switch (game[1][0]) {
                            case "O":
                                if (game[0][0] == "O") {
                                    System.out.println("Победил O!!!");
                                    return;
                                }
                            case "X":
                                break;
                        }
                        switch (game[2][1]) {
                            case "O":
                                if (game[2][2] == "O") {
                                    System.out.println("Победил O!!!");
                                    return;
                                }
                            case "X":
                                break;
                        }
                        break;
                    case "X":
                        switch (game[1][0]) {
                            case "X":
                                if (game[0][0] == "X") {
                                    System.out.println("Победил X!!!");
                                    return;
                                }
                            case "O":
                                break;
                        }
                        switch (game[2][1]) {
                            case "X":
                                if (game[2][2] == "X") {
                                    System.out.println("Победил X!!!");
                                    return;
                                }
                            case "O":
                                break;
                        }
                        break;
                    default:
                        break;
                }
                switch (game[0][2]) {
                    case "O":
                        switch (game[0][1]) {
                            case "O":
                                if (game[0][0] == "O") {
                                    System.out.println("Победил O!!!");
                                    return;
                                }
                            case "X":
                                break;
                        }
                        switch (game[1][2]) {
                            case "O":
                                if (game[2][2] == "O") {
                                    System.out.println("Победил O!!!");
                                    return;
                                }
                            case "X":
                                break;
                        }
                        break;
                    case "X":
                        switch (game[0][1]) {
                            case "X":
                                if (game[0][0] == "X") {
                                    System.out.println("Победил X!!!");
                                    return;
                                }
                            case "O":
                                break;
                        }
                        switch (game[1][2]) {
                            case "X":
                                if (game[2][2] == "X") {
                                    System.out.println("Победил X!!!");
                                    return;
                                }
                            case "O":
                                break;
                        }
                        break;
                    default:
                        break;
                }
            }

            while (name) {
                System.out.println("Первый игрок выбирает O или X");
                Scanner sc = new Scanner(System.in);
                String OorX = sc.next();
                String o = "O";
                String x = "X";
                if (OorX.hashCode() == o.hashCode()){
                    flag = 1;
                    name = false;
                } else if (OorX.hashCode() == x.hashCode()){
                    flag = 0;
                    name = false;
                } else {
                    System.out.println("Вы ввели иной символ! Повторите ввод!");
                }
            }

            switch (flag) {
                case 1:
                    boolean flagO = true;
                    do {
                        System.out.println("На какую позицию Вы хотите поставить O?");
                        System.out.println("Введите позицию");
                        Scanner scO = new Scanner(System.in);
                        String position = scO.next();
                        switch (position){
                            case "1":
                                if (game[0][0] != "O" & game[0][0] != "X") {
                                    game[0][0] = "O";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[0][0]);
                                    break;
                                }
                                flagO = false;
                                break;
                            case "2":
                                if (game[0][1] != "O" & game[0][1] != "X") {
                                    game[0][1] = "O";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[0][1]);
                                    break;
                                }
                                flagO = false;
                                break;
                            case "3":
                                if (game[0][2] != "O" & game[0][2] != "X") {
                                    game[0][2] = "O";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[0][2]);
                                    break;
                                }
                                flagO = false;
                                break;
                            case "4":
                                if (game[1][0] != "O" & game[1][0] != "X") {
                                    game[1][0] = "O";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[1][0]);
                                    break;
                                }
                                flagO = false;
                                break;
                            case "5":
                                if (game[1][1] != "O" & game[1][1] != "X") {
                                    game[1][1] = "O";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[1][1]);
                                    break;
                                }
                                flagO = false;
                                break;
                            case "6":
                                if (game[1][2] != "O" & game[1][2] != "X") {
                                    game[1][2] = "O";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[1][2]);
                                    break;
                                }
                                flagO = false;
                                break;
                            case "7":
                                if (game[2][0] != "O" & game[2][0] != "X") {
                                    game[2][0] = "O";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[2][0]);
                                    break;
                                }
                                flagO = false;
                                break;
                            case "8":
                                if (game[2][1] != "O" & game[2][1] != "X") {
                                    game[2][1] = "O";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[2][1]);
                                    break;
                                }
                                flagO = false;
                                break;
                            case "9":
                                if (game[2][2] != "O" & game[2][2] != "X") {
                                    game[2][2] = "O";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[2][2]);
                                    break;
                                }
                                flagO = false;
                                break;
                            default:
                                System.out.println("Вы вели не верную позицию! Введиет снова!");
                        }
                    } while (flagO);
                    flag = 0;
                    break;
                case 0:
                    boolean flagX = true;
                    do {
                        System.out.println("На какую позицию Вы хотите поставить X?");
                        System.out.println("Введите позицию ");
                        Scanner scX = new Scanner(System.in);
                        String position = scX.next();
                        switch (position){
                            case "1":
                                if (game[0][0] != "O" & game[0][0] != "X") {
                                    game[0][0] = "X";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[0][0]);
                                    break;
                                }
                                flagX = false;
                                break;
                            case "2":
                                if (game[0][1] != "O" & game[0][1] != "X") {
                                    game[0][1] = "X";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[0][1]);
                                    break;
                                }
                                flagX = false;
                                break;
                            case "3":
                                if (game[0][2] != "O" & game[0][2] != "X") {
                                    game[0][2] = "X";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[0][2]);
                                    break;
                                }
                                flagX = false;
                                break;
                            case "4":
                                if (game[1][0] != "O" & game[1][0] != "X") {
                                    game[1][0] = "X";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[1][0]);
                                    break;
                                }
                                flagX = false;
                                break;
                            case "5":
                                if (game[1][1] != "O" & game[1][1] != "X") {
                                    game[1][1] = "X";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[1][1]);
                                    break;
                                }
                                flagX = false;
                                break;
                            case "6":
                                if (game[1][2] != "O" & game[1][2] != "X") {
                                    game[1][2] = "X";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[1][2]);
                                    break;
                                }
                                flagX = false;
                                break;
                            case "7":
                                if (game[2][0] != "O" & game[2][0] != "X") {
                                    game[2][0] = "X";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[2][0]);
                                    break;
                                }
                                flagX = false;
                                break;
                            case "8":
                                if (game[2][1] != "O" & game[2][1] != "X") {
                                    game[2][1] = "X";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[2][1]);
                                    break;
                                }
                                flagX = false;
                                break;
                            case "9":
                                if (game[2][2] != "O" & game[2][2] != "X") {
                                    game[2][2] = "X";
                                } else {
                                    System.out.println("На этой позиции уже стоит " + game[2][2]);
                                    break;
                                }
                                flagX = false;
                                break;
                            default:
                                System.out.println("Вы вели не верную позицию! Введиет снова!");
                        }
                    } while (flagX);
                    flag = 1;
                    break;
            }
            col++;
            System.out.println("Ход " + (col+1));
        }

    }

}
