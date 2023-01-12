package org.laba;

import java.util.ArrayList;

public class Department {
    public Coordinate depCoordinates;
    public ArrayList<Order> orders = new ArrayList<>();

    public Department(Coordinate depCoordinates) {
        this.depCoordinates = depCoordinates;
    }

    public void assignOrder(Coordinate orderCoordinates) {
        Order newOrder = new Order();
        this.setCourier(orderCoordinates, newOrder);
        this.orders.add(newOrder);
    }

    private void setCourier(Coordinate orderSpot, Order order) {
        double distance = this.distance(orderSpot, this.depCoordinates);
        if (distance >= 3000) {
            order.sendCourier(new BicycleCourier(), distance);
            return;
        }
        order.sendCourier(new FootCourier(), distance);
    }

    private double distance(Coordinate firstSpot, Coordinate secondSpot) {
        final int R = 6371;
        double latDistance = Math.toRadians(secondSpot.lat() - firstSpot.lat());
        double lngDistance = Math.toRadians(secondSpot.lng() - firstSpot.lng());
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(firstSpot.lat())) * Math.cos(Math.toRadians(secondSpot.lat()))
                * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000;
        return distance;
    }
}
