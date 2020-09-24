package kiscode.study.algorithm.test;

import kiscode.study.algorithm.MockData;
import kiscode.study.algorithm.sort.Bubble;
import kiscode.study.algorithm.sort.Insertion;
import kiscode.study.algorithm.sort.Selection;

import java.util.Arrays;

/****
 * Description: 排序测试
 * Author:  keno
 * CreateDate: 2020/9/23 22:27
 */
public class SortTest {
    public static void main(String[] args) {
        Integer[] array = MockData.randomArray(100);

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array));

/*
        Bubble.sort(array);
        System.out.println("Bubble sort Array:");
        System.out.println(Arrays.toString(array));
*/
/*

        Selection.sort(array);
        System.out.println("Selection sort Array:");
        System.out.println(Arrays.toString(array));

*/

        Insertion.sort(array);
        System.out.println("Insertion sort Array:");
        System.out.println(Arrays.toString(array));
    }
}
