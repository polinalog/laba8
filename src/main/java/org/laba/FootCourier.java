package org.laba;

public class FootCourier implements Courier {
    @Override
    public void deliver(double distance) {
        double time = distance / 1000 / this.speed;
        System.out.println("Your order is delivered by foot courier");
        System.out.print("Your delivery will arrive in ");
        System.out.print(time);
        System.out.println(" hours");
    }
}
