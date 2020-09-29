package kiscode.study.algorithm.sort.util;

import java.util.Random;

public class SortUtil {

    /***
     * 比较两个 Comparable大小
     * @param a 变量a
     * @param b 变量b
     * @return 变量a是否大于变量b
     */
    public static boolean greater(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }


    /***
     * 比较两个 Comparable大小
     * @param a 变量a
     * @param b 变量b
     * @return 变量a是否小于变量b
     */
    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

}
