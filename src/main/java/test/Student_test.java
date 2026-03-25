package test;

import javabean.Student;
import javabean.Student.*;
public class Student_test {
    static void main(String[] args) {
        Student s = new Student();
        s.setName("小王");
        s.setAge(18);
        Student.teacher = "老师1";

    }


}
