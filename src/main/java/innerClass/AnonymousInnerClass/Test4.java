package innerClass.AnonymousInnerClass;

public class Test4 {
    public static void main(String[] args) {
//        Student s = new Student();
//        swim(s);

        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("游泳");
            }
        };
        swim(s1);

        Sing s2 = new Sing() {


            @Override
            public void sing() {
                System.out.println("唱歌");
            }
        };

        singing(s2);

    }

    public static void swim(Swim s) {
        s.swimming();
    }

    public static void singing(Sing s){
        s.sing();

    }

}
