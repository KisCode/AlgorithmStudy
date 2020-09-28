package kiscode.study.algorithm.sort;

/****
 * Description:  归并排序
 * Author:  keno
 * CreateDate: 2020/9/27 22:38
 */
public class Merge {

    public static void sort(Comparable[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        sort(arr, startIndex, endIndex);
    }

    private static void sort(Comparable[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        sort(arr, startIndex, mid);
        sort(arr, mid + 1, endIndex);
        System.out.println("startIndex:" + startIndex + "\tendIndex:" + endIndex);
    }

}
