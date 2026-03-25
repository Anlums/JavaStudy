package polymorphic.test2;

public class test2 {
    public static void main(String[] args) {
        Fu fu = new Zi();
        //创建了子类对象，赋值给了父类类型

        System.out.println(fu.name);
       // System.out.println(fu.name2);
        fu.show();
        fu.fushow();
        //fu.zishow();

        Zi z = (Zi)fu;
        z.zishow();

        Ye y = new Fu();
       //错误的 Zi z = (Zi) y;
        //只能两者之间转换不能掺杂第三者

        //判断
        if(y instanceof Fu){
            System.out.println("y是Fu的子类");
        }
        else if(y instanceof Ye){
            System.out.println("y是Ye的子类");
        }
    }


}
