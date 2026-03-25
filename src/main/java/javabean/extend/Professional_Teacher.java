package javabean.extend;

public class Professional_Teacher extends College_Teacher{
    private String subject;

    public Professional_Teacher(String subject) {
        this.subject = subject;
    }

    public Professional_Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void teach() {
        System.out.println("Professional course knowledge");
    }


}
