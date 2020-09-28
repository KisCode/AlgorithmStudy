package kiscode.study.algorithm.sort;

import kiscode.study.algorithm.sort.util.SortUtil;

/****
 * Description:  归并排序
 * Author:  keno
 * CreateDate: 2020/9/27 22:38
 */
public class Merge {

    public static void sort(Comparable[] arr) {
        Comparable[] tempArr = new Comparable[arr.length];
        int startIndex = 0;
        int endIndex = arr.length - 1;
        sort(arr, tempArr, startIndex, endIndex);
    }

    private static void sort(Comparable[] arr, Comparable[] tempArr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        sort(arr, tempArr, startIndex, mid);
        sort(arr, tempArr, mid + 1, endIndex);
//        System.out.println("startIndex:" + startIndex + "\tendIndex:" + endIndex);

        merge(arr, tempArr, startIndex, mid, endIndex);
    }

    private static void merge(Comparable[] arr, Comparable[] tempArr, int startIndex, int mid, int endIndex) {
        int left = startIndex;
        int right = mid + 1;
        int p = startIndex;
        while (left <= mid && right <= endIndex) {

            if (SortUtil.less(arr[left], arr[right])) {
                tempArr[p] = arr[left];
                left++;
                p++;
            }

            if (SortUtil.less(arr[right], arr[left])) {
                tempArr[p] = arr[right];
                right++;
                p++;
            }
        }

        while (left <= mid) {
            tempArr[p] = arr[left];
            left++;
            p++;
        }

        while (right <= endIndex) {
            tempArr[p] = arr[right];
            right++;
            p++;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            arr[i] = tempArr[i];
        }
    }

}
