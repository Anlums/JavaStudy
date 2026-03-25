package polymorphic.test1;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, String accout, String password) {
        super(name, accout, password);
    }

    @Override
    public void work() {
        System.out.println("学生" + getName() + "正在学习");
    }
}
