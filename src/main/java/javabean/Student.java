package javabean;

public class Student {
    private String name;
    private int age;

    public static String teacher;

    public final int a = 1;
    //final的变量不可改变，没有set方法，也没有有参构造方法

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void study() {
        System.out.println(this.name + "study");
    }
    public void eat() {
        System.out.println(this.name + "eat");
    }
    public void sleep() {
        System.out.println(this.name + "sleep");
    }
    public void show() {
        System.out.println("name:"+name+" age:"+age);
    }
}
