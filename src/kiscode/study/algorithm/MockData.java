package kiscode.study.algorithm;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MockData {

    /***
     * 生成指定长度的随机整数数组
     * @param length 数组长度
     * @return 指定长度的随机整数数组
     */
    public static Integer[] randomArray(int length) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        int bound = length * 10;
        Integer[] array = new Integer[length];
        while (set.size() < length) {
            int randomNum = random.nextInt(bound);
            if (!set.contains(randomNum)) {
                set.add(randomNum);
            }
        }
        return set.toArray(array);
    }
}
