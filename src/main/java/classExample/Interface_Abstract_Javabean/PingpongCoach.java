package classExample.Interface_Abstract_Javabean;

public class PingpongCoach extends Person implements SpeakEnglish,Teach{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");
    }
}
