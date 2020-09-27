package kiscode.study.algorithm.sort;

import kiscode.study.algorithm.sort.util.SortUtil;

/****
 * Description:选择排序
 * Author:  keno
 * CreateDate: 2020/9/23 21:52
 */
public class Selection {

    /***
     * 冒泡排序
     * 1. 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
     * 2. 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 3. 重复第二步，直到所有元素均排序完毕。
     * @param arr
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
            SortUtil.exchange(arr, i, minIndex);
        }
    }
}
