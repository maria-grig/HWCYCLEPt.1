package ru.netology.sqr;

public class SQRService {
    public int sqrquantity(int lowerLimit, int upperLimit) {

        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int squareI = i * i;
            if (squareI >= lowerLimit && squareI <= upperLimit) {
                counter += 1;
            }

        }
        return counter;

    }
}