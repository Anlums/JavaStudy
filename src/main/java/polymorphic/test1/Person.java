package polymorphic.test1;

public class Person {
    private String name;
    private String accout;
    private String password;

    public Person() {
    }

    public Person(String name, String accout, String password) {
        this.name = name;
        this.accout = accout;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccout() {
        return accout;
    }

    public void setAccout(String accout) {
        this.accout = accout;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void work() {
        System.out.println("工作");
    }


}
