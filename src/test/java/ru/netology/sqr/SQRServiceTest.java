package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldBothLimitsBeOk() {
        SQRService service = new SQRService();

        int lowerLimit = 200;
        int upperLimit = 300;
        int expected = 3;

        int actual = service.sqrquantity(lowerLimit, upperLimit);

        assertEquals(expected, actual);

    }
    @Test
    void shouldBothLimitsBeMoreThanInitialNumber() {
        SQRService service = new SQRService();

        int lowerLimit = 260;
        int upperLimit = 301;
        int expected = 1;

        int actual = service.sqrquantity(lowerLimit, upperLimit);

        assertEquals(expected, actual);

    }
    @Test
    void shouldBothLimitsBeLessThanInitialNumber() {
        SQRService service = new SQRService();

        int lowerLimit = 199;
        int upperLimit = 299;
        int expected = 3;

        int actual = service.sqrquantity(lowerLimit, upperLimit);

        assertEquals(expected, actual);

    }
    @Test
    void shouldUpperLimitBeMoreThanInitialNumber() {
        SQRService service = new SQRService();

        int lowerLimit = 200;
        int upperLimit = 366;
        int expected = 5;

        int actual = service.sqrquantity(lowerLimit, upperLimit);

        assertEquals(expected, actual);

    }

    @Test
    void shouldLowerLimitBeMoreThanInitialNumber() {
        SQRService service = new SQRService();

        int lowerLimit = 269;
        int upperLimit = 300;
        int expected = 1;

        int actual = service.sqrquantity(lowerLimit, upperLimit);

        assertEquals(expected, actual);

    }

    @Test
    void ShouldUpperLimitBeLessThanInitialNumber() {
        SQRService service = new SQRService();

        int lowerLimit = 200;
        int upperLimit = 220;
        int expected = 0;

        int actual = service.sqrquantity(lowerLimit, upperLimit);

        assertEquals(expected, actual);

    }

    @Test
    void ShouldLowerLimitBeMoreThanInitialNumber() {
        SQRService service = new SQRService();

        int lowerLimit = 99;
        int upperLimit = 300;
        int expected = 8;

        int actual = service.sqrquantity(lowerLimit, upperLimit);

        assertEquals(expected, actual);

    }
}