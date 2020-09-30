package kiscode.study.algorithm.sort;

import kiscode.study.algorithm.sort.util.SortUtil;

/****
 * Description:选择排序
 *优点：相比冒泡排序交换次数少
 * Author:  keno
 * CreateDate: 2020/9/23 21:52
 */
public class Selection {

    /***
     * 选择排序
     * 1. 依次将每个元素和数组中其他元素进行比较，记录最小值的下标，并进行交换
     * 2. 下一个元素 继续第1步
     * @param arr 待排序数组
     */
    public static void sort(Comparable[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (SortUtil.greater(arr[minIndex], arr[j])) {
                    minIndex = j;
                }
            }
            SortUtil.swap(arr, i, minIndex);
        }
    }
}
