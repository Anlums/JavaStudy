package javabean.extend;

public class General_Education_Teacher extends College_Teacher{
    public General_Education_Teacher() {
    }

    public General_Education_Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("General knowledge teach");
    }
}
