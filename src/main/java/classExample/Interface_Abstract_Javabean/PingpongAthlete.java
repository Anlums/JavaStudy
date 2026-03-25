package classExample.Interface_Abstract_Javabean;

public class PingpongAthlete extends Person implements SpeakEnglish,Study{
    public PingpongAthlete() {
    }

    public PingpongAthlete(String name, int age) {
        super(name, age);
    }


    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习");
    }
}
