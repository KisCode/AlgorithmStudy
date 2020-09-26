package kiscode.study.algorithm.sort;

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
        quickSort(arr, startIndex, partPos - 1);
        quickSort(arr, partPos + 1, endIndex);
    }

    private static int partion(Comparable[] arr, int startIndex, int endIndex) {
        Comparable pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex + 1;

        while (left < right) {
            //先从右往左扫描，找到比基准值pivot小的元素
            while (SortUtil.greater(pivot, arr[--right])) {
                if (right == startIndex) {
                    break;
                }
            }

            while (SortUtil.greater(arr[++left], pivot)) {
                if (left == endIndex) {
                    break;
                }
            }

            SortUtil.exchange(arr, left, right);
        }
        SortUtil.exchange(arr, startIndex, right);
        return right;
    }

}
