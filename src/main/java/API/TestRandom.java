package API;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        double v = random.nextDouble(1,2);//[1,2)
        System.out.println(v);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(1,10));
        }

    }


}
