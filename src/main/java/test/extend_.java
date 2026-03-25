package test;

import javabean.Student_extends;
import javabean.teacher_extends;
public class extend_ {

    public static void main(String[] args) {
        Student_extends s = new Student_extends();
        s.age = 18;
        s.eat();
        s.study();

        teacher_extends t = new teacher_extends();
        t.subject = "历史";
        t.teach();
        t.eat();



    }

}
