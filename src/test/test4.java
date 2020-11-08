package test;

import java.io.*;

public class test4 {

    public static void main(String[] args) {
//        testSerializable();
        testDeserialize();
    }

    public static void testSerializable() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("G:/test/test/a.txt"));
            oos.writeObject(new Car("benz", "red", 300));
            oos.writeObject(new Car("bwm", "green", 200));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testDeserialize() {
        try {
            ObjectInputStream ops = new ObjectInputStream(
                    new FileInputStream("G:/test/test/a.txt"));
            System.out.println(ops.readObject());
            System.out.println(ops.readObject());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Car implements Serializable {
    private String brand;
    private String color;
    private Integer maxSpeed;

    public Car() {}

    public Car(String brand, String color, Integer maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
