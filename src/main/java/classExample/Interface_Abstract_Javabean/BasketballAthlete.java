package classExample.Interface_Abstract_Javabean;

public class BasketballAthlete extends Person implements Study{

    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习篮球");
    }
}
