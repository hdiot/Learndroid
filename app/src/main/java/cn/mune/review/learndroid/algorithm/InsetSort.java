package cn.mune.review.learndroid.algorithm;

/**
 * @ProjectName: Learndroid
 * @Package: cn.mune.review.learndroid.algorithm
 * @ClassName: InsetSort
 * @Author: mebee
 * @CreateDate: 2018/11/22 10:14
 * @Description:
 */
public class InsetSort {


    public static void insertSort(int[] in) {
        // 数组长度
        int length = in.length;
        // 插入的数
        int insertNum;
        // 插入的次数
        for (int i = 1; i < length; i++) {
            insertNum = in[i];
            int compareIndex = i-1;
            while (compareIndex >= 0 && in[compareIndex] > insertNum) {
                in[compareIndex+1] = in[compareIndex];
                compareIndex--;
            }

            in[compareIndex+1] = insertNum;
        }

    }

    public static void main(String[] args) {
        int [] a = {1,4,6,2,6,3};

        insertSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
    }

}
