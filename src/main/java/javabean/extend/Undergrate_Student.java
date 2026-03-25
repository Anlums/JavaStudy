package javabean.extend;

public class Undergrate_Student extends College_Student{
    public Undergrate_Student(String name, int age, String grade) {
        super(name, age, grade);
    }

    public Undergrate_Student() {
    }

    public void study() {
        System.out.println("undergrate_study");
    }


}
