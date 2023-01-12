package org.laba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleCourierTest {
    @Test
    void speed() {
        double speed = 20;
        BicycleCourier courier = new BicycleCourier();
        assertEquals(speed, courier.speed);
    }
}