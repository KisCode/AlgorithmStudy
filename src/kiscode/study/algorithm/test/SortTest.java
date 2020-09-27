package kiscode.study.algorithm.test;

import kiscode.study.algorithm.MockData;
import kiscode.study.algorithm.sort.*;
import kiscode.study.algorithm.sort.enums.SortType;

import java.util.Arrays;
import java.util.Calendar;

/****
 * Description: 排序测试
 * Author:  keno
 * CreateDate: 2020/9/23 22:27
 */
public class SortTest {
    public static void main(String[] args) {
        Integer[] array = MockData.randomArray(4);

//        System.out.println("Original Array:");
//        System.out.println(Arrays.toString(array));
//        sortTest(array, SortType.BUBBLE);
//        sortTest(array, SortType.SELECTION);
//        sortTest(array, SortType.INSERTION);
//        sortTest(array, SortType.SELECTION);
//        sortTest(array, SortType.QUICK);
        sortTest(array, SortType.MERGE);
    }


    private static void sortTest(Integer[] array, SortType type) {
        Integer[] arrayNew = array.clone();
//        System.out.println(type + " originalArray:\n" + Arrays.toString(arrayNew));
        long startTime = Calendar.getInstance().getTimeInMillis();
        sort(arrayNew, type);
        long waitTime = Calendar.getInstance().getTimeInMillis() - startTime;
        System.out.println(type + " sort waitTime:" + waitTime + "ms");
//        System.out.println(Arrays.toString(arrayNew));
    }

    private static void sort(Integer[] array, SortType type) {
        switch (type) {
            case QUICK:
                Quick.sort(array);
                break;
            case MERGE:
                Merge.sort(array);
                break;
            case BUBBLE:
                Bubble.sort(array);
                break;
            case SELECTION:
                Selection.sort(array);
                break;
            case INSERTION:
                Insertion.sort(array);
                break;
            case SHELL:
                Shell.sort(array);
                break;
        }
    }
}
