package Interface.test1;

public class Dog extends  Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }



    public void eatBone() {
        System.out.println("狗吃骨头");
    }


    @Override
    public void swim() {
        System.out.println("狗会游泳");
    }
}
