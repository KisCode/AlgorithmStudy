package kiscode.study.algorithm.sort;

import kiscode.study.algorithm.sort.util.SortUtil;

/****
 * Description:选择排序
 * Author:  keno
 * CreateDate: 2020/9/23 21:52
 */
public class Selection {

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
