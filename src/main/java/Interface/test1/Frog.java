package Interface.test1;

public class Frog extends  Animal implements Swim{
    public Frog() {
    }
    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println("青蛙正在游");
    }
    public void eatInsect() {
        System.out.println("青蛙吃虫子");
    }

}
