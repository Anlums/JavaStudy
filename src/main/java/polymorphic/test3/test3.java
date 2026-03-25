package polymorphic.test3;


public class test3 {
    public static void main(String[] args) {
        Person p = new Person("张三", 18, "男");
        System.out.println(p.getName() + " " + p.getAge() + " " + p.getGender());
        Bicycle b = new Bicycle("cycle", 10);
        System.out.println(b.getBrand() + " " + b.getSpeed());
        Car c = new Car("car", 100);
        System.out.println(c.getBrand() + " " + c.getSpeed());
        p.drive(b);
        p.drive(c);


    }



}
