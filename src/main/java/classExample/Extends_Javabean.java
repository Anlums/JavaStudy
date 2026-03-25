package classExample;

import javabean.extend.*;

public class Extends_Javabean {
    public static void main(String[] args) {
        Undergrate_Student cs = new Undergrate_Student("本科生", 18, "2020级");
        Master_Student ms = new Master_Student("研究生", 18, "2020级");
        Professional_Teacher pt = new Professional_Teacher("专业教师", 18, "math");
        General_Education_Teacher get = new General_Education_Teacher("普通教师", 18);
        System.out.println(cs.getName() + " " + cs.getAge() + " " + cs.getGrade());
        cs.eat();
        cs.sleep();
        cs.study();
        System.out.println("------------------------");
        System.out.println(ms.getName() + " " + ms.getAge() + " " + ms.getGrade());
        ms.eat();
        ms.sleep();
        ms.study();
        System.out.println("------------------------");
        System.out.println(pt.getName() + " " + pt.getAge() + " " + pt.getSubject());
        pt.eat();
        pt.sleep();
        pt.teach();
        System.out.println("------------------------");
        System.out.println(get.getName() + " " + get.getAge());
        get.eat();
        get.sleep();
        get.teach();



    }


}
