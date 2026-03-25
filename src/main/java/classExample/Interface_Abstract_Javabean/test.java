package classExample.Interface_Abstract_Javabean;

public class test {
    public static void main(String[] args) {
        PingpongAthlete pa = new PingpongAthlete("张三", 18);
        pa.speakEnglish();
        pa.study();
        System.out.println(pa.getName() + " " + pa.getAge());
        System.out.println("------------------------");
        PingpongCoach pc = new PingpongCoach("李四", 20);
        pc.speakEnglish();
        pc.teach();
        System.out.println(pc.getName() + " " + pc.getAge());
        System.out.println("------------------------");
        BasketballAthlete ba = new BasketballAthlete("王五", 19);
        ba.study();
        System.out.println(ba.getName() + " " + ba.getAge());
        System.out.println("------------------------");
        BasketballCoach bc = new BasketballCoach("老六", 30);
        bc.teach();
        System.out.println(bc.getName() + " " + bc.getAge());
        System.out.println("------------------------");


    }
}
