package polymorphic.test1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张1","111","111");
        Teacher t = new Teacher("张2","222","222");
        Admin a = new Admin("张3","333","333");
        Student_Manger sm = new Student_Manger();
        sm.register(s);
        sm.register(t);
        sm.register(a);

    }


}
