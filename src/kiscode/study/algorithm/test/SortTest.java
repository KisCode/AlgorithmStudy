package kiscode.study.algorithm.test;

import kiscode.study.algorithm.MockData;
import kiscode.study.algorithm.sort.*;

import java.util.Arrays;

/****
 * Description: 排序测试
 * Author:  keno
 * CreateDate: 2020/9/23 22:27
 */
public class SortTest {
    public static void main(String[] args) {
        Integer[] array = MockData.randomArray(10);

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
/*
        Insertion.sort(array);
        System.out.println("Insertion sort Array:");
        System.out.println(Arrays.toString(array));
        */
/*


        Shell.sort(array);
        System.out.println("Shell sort Array:");
        System.out.println(Arrays.toString(array));
*/


        Quick.sort(array);
        System.out.println("Quick sort Array:");
        System.out.println(Arrays.toString(array));
    }
}
