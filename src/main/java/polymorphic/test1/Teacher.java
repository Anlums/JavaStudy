package polymorphic.test1;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, String accout, String password) {
        super(name, accout, password);
    }

    @Override
    public void work() {
        System.out.println("老师" + getName() + "正在工作");
    }
}
