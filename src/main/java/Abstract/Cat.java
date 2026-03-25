package Abstract;

public class Cat extends  Animal{
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void work() {
        System.out.println("猫正在工作");
    }
}
