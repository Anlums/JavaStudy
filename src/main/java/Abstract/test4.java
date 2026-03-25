package Abstract;

public class test4 {
    public static void main(String[] args) {
        Cat cat = new Cat("小猫","白色");
        System.out.println(cat.getName() + " " + cat.getColor());
        cat.eat();
        cat.work();
        cat.drink();
        Dog dog = new Dog("小狗","黑色");
        System.out.println(dog.getName() + " " + dog.getColor());
        dog.eat();
        dog.lookHome();
        dog.drink();

        //1.Animal a = new Animal();



    }
}
