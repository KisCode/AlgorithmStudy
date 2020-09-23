package kiscode.study.algorithm.sort;

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
/*
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (SortUtil.greater(arr[i], arr[j])) {
                    SortUtil.exchange(arr, i, j);
                }
            }
        }
*/
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (SortUtil.greater(arr[j], arr[j + 1])) {
                    SortUtil.exchange(arr, j, j + 1);
                }
            }
        }
    }
}
