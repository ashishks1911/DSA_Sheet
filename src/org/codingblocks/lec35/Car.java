package org.codingblocks.lec35;

public class Car implements Comparable<Car>{
    int price;
    int speed;
    String color;

    public Car(int price, int speed, String color) {
        this.price = price;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.speed - o.speed;
    }
}
