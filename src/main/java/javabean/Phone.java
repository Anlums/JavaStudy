package javabean;

public class Phone extends Inteligent_equipment{
    public Phone() {
    }

    public Phone(String brand, double price) {
        super(brand, price);
    }

    public void call(){
        System.out.println("打电话");
    }
    public  void sendMessage(){
        System.out.println("发短信");
    }

}
