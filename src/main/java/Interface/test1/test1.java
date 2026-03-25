package Interface.test1;

public class test1 {
    public static void main(String[] args) {
        Dog dog = new Dog("小黑","黑色");
        System.out.println(dog.getName() + " " + dog.getColor());
        dog.eatBone();
        dog.swim();
        Frog frog = new Frog("小青","绿色");
        System.out.println(frog.getName() + " " + frog.getColor());
        frog.eatInsect();
        frog.swim();
        Rabbit rabbit = new Rabbit("小兔子","白色");
        System.out.println(rabbit.getName() + " " + rabbit.getColor());
        rabbit.eatCarror();
        System.out.println("------------------------");
    }
}
