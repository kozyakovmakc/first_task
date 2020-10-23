package com.first_task;

import java.util.Scanner;

public class user_number extends number {
    void input_number(int level) {
        boolean a;
        Scanner input = new Scanner(System.in);
        do {
            a = false;
            System.out.print("Введите отгадку последовательности (или сдаться): ");
            setValue(input.nextLine());
            //value = input.nextLine();
            if (getValue().equals("сдаться")) break;
            if (getValue().length()!=level) {
                System.out.println("Введено неверное количество цифр");
                a = true;
                continue;
            }
            for (int i = 0; i < getValue().length() - 1; i++)
                for (int j = i + 1; j < getValue().length(); j++)
                    if (getValue().charAt(i) == getValue().charAt(j)) a = true;
        } while (a);
    }

    boolean you_win(accidental_number a) {
        if (a.getValue().equals(this.getValue())) {
            return true;
        } else return false;
    }

    void cow_bull(accidental_number a){
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < this.getValue().length(); i++)
            for (int j = 0; j < this.getValue().length(); j++)
                if (this.getValue().charAt(i) == a.getValue().charAt(j) && i == j) bull++;
                else if (this.getValue().charAt(i) == a.getValue().charAt(j) && i != j) cow++;
        //if (win) {
            System.out.println("cow = " + cow);
            System.out.println("bull = " + bull);
        }
    boolean surrender(){
        if (getValue().equals("сдаться")) return true;
        else return false;
    }

    void out_answer(accidental_number a){
        System.out.print("Ответ - " + a.getValue());
    }

}
