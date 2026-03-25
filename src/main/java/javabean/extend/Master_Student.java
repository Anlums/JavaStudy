package javabean.extend;

public class Master_Student extends College_Student{
    public Master_Student(String name, int age, String grade) {
        super(name, age, grade);
    }

    public Master_Student() {
    }

    public void study() {
        System.out.println("master study");
    }

    @Override
    public void sleep() {
        System.out.println("豪华版学生公寓睡觉");


    }
}
