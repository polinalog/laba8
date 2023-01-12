package org.laba;

public class Order {
    public Coordinate orderCoordinates = new Coordinate(0, 0);

    void Order(Coordinate orderCoordinates) {
        this.orderCoordinates = orderCoordinates;
    }

    public void sendCourier(Courier courier, double distance) {
        courier.deliver(distance);
    }
}
