package org.laba;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    @Test
    void department() {
        Coordinate coordinate = new Coordinate(1.0, 1.0);
        Department department = new Department(coordinate);

        assertEquals(department.depCoordinates, coordinate);
    }

    @Test
    void assignOrder() {
        Coordinate coordinate = new Coordinate(1.0, 1.0);
        Department department = new Department(new Coordinate(1.0, 1.0));

        assertEquals(0, department.orders.toArray().length);
        department.assignOrder(coordinate);
        assertEquals(1, department.orders.toArray().length);
    }
}