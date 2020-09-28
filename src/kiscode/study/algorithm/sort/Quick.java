package kiscode.study.algorithm.sort;

import kiscode.study.algorithm.sort.util.SortUtil;

/****
 * Description: 快速排序
 * Author:  keno
 * CreateDate: 2020/9/26 21:34
 */
public class Quick {
    public static void sort(Comparable[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(Comparable[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int partPos = partion(arr, startIndex, endIndex);
//        System.out.println("partPos = " + partPos);
        quickSort(arr, startIndex, partPos - 1);
        quickSort(arr, partPos + 1, endIndex);
    }

    private static int partion(Comparable[] arr, int startIndex, int endIndex) {
        Comparable pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex + 1;

        while (left < right) {
            //先从右往左扫描，找到比基准值pivot小的元素
            while (left < right && SortUtil.greater(arr[--right], pivot)) {
            }

            //从左往右扫描，找到比基准值pivot大的元素
            while (left < right && !SortUtil.greater(arr[++left], pivot)) {
            }
            SortUtil.exchange(arr, left, right);
//            System.out.println("left = " + left + "\tright = " + right);
        }
        SortUtil.exchange(arr, startIndex, left);
        return left;
    }

}
