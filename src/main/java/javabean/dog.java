package javabean;

public class dog {
    private int age; // 私有属性

    public String name;
    public String color;

    public dog(){
        System.out.println("无参构造方法");
    }
    public dog(int age,String name,String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void show(){
        System.out.println("name:"+name+" age:"+age+" color:"+color);
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age1) {
        if(age > 0) age = age1;
        else System.out.println("年龄不能小于0");
    }





}
