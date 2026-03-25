package classExample;

public class Method_Rewrite {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.price = 1000;
        System.out.println(phone.caulculatePrice());

        Laptop laptop = new Laptop();
        laptop.price = 5000;
        System.out.println(laptop.caulculatePrice());

        Tablet tablet = new Tablet();
        tablet.price = 3000;
        System.out.println(tablet.caulculatePrice());

    }

    public static class Inteligent_Equipment{
        public String name;
        public double price;
        public double caulculatePrice(){
            if(price < 1000) return price;
            else if(price <5000)
                return price * 0.9;
            else if(price <10000){
                return price * 0.8;
            }
            else return price * 0.7;
        }
    }
    static class Laptop extends Inteligent_Equipment{

    }
    static class Tablet extends Inteligent_Equipment{

    }
    static class Phone extends Inteligent_Equipment{
        @Override
        public double caulculatePrice() {
            if(price <1000) return price*0.9;
            else if(price <5000)
                return price * 0.9*0.9;
            else if(price <10000){
                return price * 0.8*0.9;
            }
            else return price * 0.7*0.9;
        }
    }

}



