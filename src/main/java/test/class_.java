package test;

import javabean.*;
public class class_ {
    public static void main(String[] args) {
        dog d = new dog();
        d.setAge(-1);
        d.setAge(10);
        d.name = "小黄";
        d.color = "白色";
        d.show();

        dog a = new dog(10,"小黄","白色");


    }


}
