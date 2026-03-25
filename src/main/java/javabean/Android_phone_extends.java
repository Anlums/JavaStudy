package javabean;

public class Android_phone_extends extends Phone{
    public double price = 1.0;
    public Android_phone_extends(double price) {
        this.price = price;
    }

    public Android_phone_extends(String brand, double price, double price1) {
        super(brand, price);
        this.price = price1;
    }




    public void nfc(){
        System.out.println("使用NFC");
    }

    //就近原则
    public void jiujin() {
        double price = 3.0;
        System.out.println(price);
        System.out.println(this.price);
        System.out.println(super.price);
    }
    //方法重写
    @Override//这是注解，给虚拟机看的，告诉编译器，这个方法被重写
    public void call() {
        System.out.println("使用Android手机打视频电话");

    }
}
