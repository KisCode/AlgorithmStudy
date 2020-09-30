package kiscode.study.algorithm.sort;

import kiscode.study.algorithm.sort.util.SortUtil;

/****
 * Description: 冒泡排序
 * 思路：两两比较相邻元素，如果反序则交换位置
 * Author:  keno
 * CreateDate: 2020/9/23 21:52
 */
public class Bubble {

    /***
     * 冒泡排序
     * 1. 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
     * 2. 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾
     * 3. 重复第二步，直到所有元素均排序完毕。
     * @param arr 待排序数组
     */
    public static void sort(Comparable[] arr) {
        //1. 升序排序
/*
        for (int i = 0; i < arr.length - 1; i++) { //控制排序趟数，一共arr.length-1趟
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (SortUtil.greater(arr[j], arr[j + 1])) {
                    SortUtil.swap(arr, j, j + 1);
                }
            }
        }
        */


        //降序排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (SortUtil.greater(arr[j], arr[j - 1])) {
                    SortUtil.swap(arr, j, j - 1);
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

    /***
     * 冒泡排序 优化版本
     *
     *
     * @param arr
     */
    public static void sortOpt(Comparable[] arr) {
        int count = 0;
        boolean needSwap = true;

//      如  [ 0,1,3,4,2,5,10]， 当元素 i=3 arr[3]=2被冒泡后，后续元素无需进行交换，能提升一定性能

        //1. 升序排序
        for (int i = 0; i < arr.length - 1 && needSwap; i++) {
            //控制排序趟数，一共arr.length-1趟
            needSwap = false;
            count++;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (SortUtil.greater(arr[j], arr[j + 1])) {
                    SortUtil.swap(arr, j, j + 1);
                    needSwap = true;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
