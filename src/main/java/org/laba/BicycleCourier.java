package org.laba;

public class BicycleCourier implements Courier {
    public double speed = 20;
    @Override
    public void deliver(double distance) {
        double time = distance / 1000 / this.speed;
        System.out.println("Your order is delivered by bicycle courier");
        System.out.print("Your delivery will arrive in ");
        System.out.print(time);
        System.out.println(" hours");
    }
}
