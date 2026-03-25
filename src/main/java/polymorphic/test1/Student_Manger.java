package polymorphic.test1;

public class Student_Manger {
    public void register(Person person){
        System.out.println(person.getName()+" "+person.getAccout()+" "+person.getPassword());
        person.work();
    }


}
