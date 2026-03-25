package polymorphic.test3;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println(brand+"的交通工具正在以"+speed+"km/h的速度移动");

    }
    public void ringBell() {
        System.out.println("自行车正在响铃");
    }
}
