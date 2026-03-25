package classExample.Interface_Abstract_Javabean;

public class BasketballCoach extends Person implements  Teach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }
}
