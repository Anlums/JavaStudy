package Interface.test1;

public class Rabbit extends  Animal{

    public Rabbit() {
    }

    public Rabbit(String name, String color) {
        super(name, color);
    }
    public void eatCarror() {
        System.out.println("兔子吃胡萝卜");
    }

}
