package com.first_task;

import java.util.Random;

public class accidental_number extends number {
    accidental_number(int x) {
        int k;
        Random random = new Random();
        k = random.nextInt(9) + 1;
        setValue(getValue()+(int) k);
        //value += (int) k;
            do {
                k = random.nextInt(9) + 1;
                for (char y : getValue().toCharArray()) {
                    if (Character.getNumericValue(y) == k) break;
                    if (y == getValue().charAt(getValue().length() - 1)) setValue(getValue()+(int) k);
                }
            } while (getValue().length() < x);

        }
    }