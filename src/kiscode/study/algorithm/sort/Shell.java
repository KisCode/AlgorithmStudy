package kiscode.study.algorithm.sort;

/****
 * Description:  希尔排序（插入排序改进版）,又称 “缩小增量排序”
 * 实现思路：
 * 1. 选定一个增长量h,将数组分为多个子数组
 * 2. 对子数组进行插入排序
 * 3. 缩小增长量，重复第二步
 * Author:  keno
 * CreateDate: 2020/9/24 21:15
 */
public class Shell {
    public static void sort(Comparable[] arr) {
        int length = arr.length;
        int gap = length / 2;
        while (gap > 0) {

/*          //插入排序
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j > 0; j--) {
                    if (SortUtil.greater(arr[j - 1], arr[j])) {
                        SortUtil.exchange(arr, j - 1, j);
                    }
                }
            }*/

            //1. 找到待插入的元素（有序数组）
            for (int i = gap; i < length; i++) {
                // 把待插入的元素插入到有序数组中
                for (int j = i; j >= gap; j -= gap) {
                    if (SortUtil.greater(arr[j - gap], arr[j])) {
                        SortUtil.exchange(arr, j - gap, j);
                    }
                }
            }
            gap = gap / 2;
        }
    }
}
