package org.laba;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(new Coordinate(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
//        System.out.println(department.depCoordinates);
        department.assignOrder(new Coordinate(Double.parseDouble(args[2]), Double.parseDouble(args[3])));
    }
}