package polymorphic.test1;

public class Admin extends Person {
    public Admin() {
    }

    public Admin(String name, String accout, String password) {
        super(name, accout, password);
    }

    @Override
    public void work() {
        System.out.println("管理员" + getName() + "正在管理");
    }
}
