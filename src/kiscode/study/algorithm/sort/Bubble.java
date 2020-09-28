package kiscode.study.algorithm.sort;

import kiscode.study.algorithm.sort.util.SortUtil;

/****
 * Description: 冒泡排序
 * Author:  keno
 * CreateDate: 2020/9/23 21:52
 */
public class Bubble {

    /***
         * 冒泡排序
         * @param arr
         */
        public static void sort(Comparable[] arr) {
            for (int i = 0; i < arr.length - 1; i++) { //控制排序趟数，一共arr.length-1趟
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (SortUtil.greater(arr[j], arr[j + 1])) {
                        SortUtil.exchange(arr, j, j + 1);
                    }
                }
            }

/*
        for (int i = arr.length - 1; i >= 0; i--) { //控制排序趟数
            for (int j = 0; j < i; j++) {
                if (SortUtil.greater(arr[j], arr[j + 1])) {
                    SortUtil.exchange(arr, j, j + 1);
                }
            }
        }*/
    }
}
