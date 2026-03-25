package algorithm;

import cn.hutool.core.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class lotto {
    public static void main(String[] args) {
        // 1. 生成 1-35 的集合
        List<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= 35; i++) {
            numList.add(i);
        }
        // 2. 核心：用 randomEles 从集合中选 5 个
        List<Integer> redBalls = RandomUtil.randomEles(numList, 5);


    }
}
