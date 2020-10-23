package com.first_task;

import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int level;
        do {
            System.out.print("Введите уроень игры(3,4,5): ");
            level = Integer.parseInt(input.nextLine());
            if (level == 3 || level == 4 || level == 5) break;
            System.out.println("Введите корректный уровень");
        }
        while (true);
        accidental_number number1 = new accidental_number(level);
        user_number number2 = new user_number();
        do {
            number2.input_number(level);
            if (number2.surrender()){
                number2.out_answer(number1);
                break;
            }
            if (number2.you_win(number1)) {
                System.out.print("YOU WIN");
            } else number2.cow_bull(number1);
        }
        while (!number2.you_win(number1));
    }
}
