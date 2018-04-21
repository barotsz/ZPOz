package Lab_1.Task_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        int liczba = 0b1101_1011;
        String number = Integer.toString(liczba);
        int numberD = Integer.parseInt(number);

        Scanner scr = new Scanner(System.in);

        String menu = scr.nextLine();

        switch (menu) {
            case "dziesiec":
                System.out.println(numberD);
                break;

            case "trzy":
                numberD = asBase3(numberD);
                System.out.println(numberD);
                break;

            case "szesnascie":
                number = Integer.toString(numberD, 16);
                System.out.println(number);
            default:
                System.out.println("Wrong input");

        }

    }

    public static int asBase3(int num) {
        int ret = 0, factor = 1;
        while (num > 0) {
            ret += num % 3 * factor;
            num /= 3;
            factor *= 10;
        }
        return ret;
    }

}