package polymorphic.test2;

public class Zi extends Fu{
    public String name = "子类";
    public String name2 = "子类2";
    public void zishow()
    {
        System.out.println("子类show");
    }

    @Override
    public void show() {
        System.out.println("子类重写父类show");
    }
}
