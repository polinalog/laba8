package org.laba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootCourierTest {
    @Test
    void speed() {
        double speed = 4;
        FootCourier courier = new FootCourier();
        assertEquals(speed, courier.speed);
    }
}