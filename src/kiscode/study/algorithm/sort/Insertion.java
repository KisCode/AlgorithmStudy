package kiscode.study.algorithm.sort;

import kiscode.study.algorithm.sort.util.SortUtil;

/****
 * Description: 插入排序
 * 参考实际拿扑克牌插入过程：
 * 实现思路：将待排序的数组分为两段 ： 有序 和 无序，从无序数组中第一个元素开始和有序数组中元素依次比较，如果比有序元素小则插入，依次类推
 * 具体做法：
 * 1. 将排序数组arr分为 长度为1的有序数组，和长度为 len-1 无序数组，
 * 2. 从无序数组的第一个元素开始(即arr的第二个元素) 和有序数组中元素依次比较，如果比有序元素小，则插入
 * Author:  keno
 * CreateDate: 2020/9/24 20:43
 */
public class Insertion {
    /***
     * 插入排序
     * @param arr 排序数组
     */
    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { //控制排序趟数，一共arr.length-1趟
            for (int j = i + 1; j > 0; j--) {
                if (SortUtil.greater(arr[j - 1], arr[j])) {
                    SortUtil.swap(arr, j - 1, j);
                }
            }
        }
    }
}
