package cn.mune.review.learndroid.algorithm;

/**
 * @ProjectName: Learndroid
 * @Package: cn.mune.review.learndroid.algorithm
 * @ClassName: ShellSort
 * @Author: mebee
 * @CreateDate: 2018/11/22 10:42
 * @Description:
 */
public class ShellSort {

    public static void shellSort(int[] data)
    {
        int j = 0;
        int temp = 0;
        //每次将步长缩短为原来的一半
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < data.length; i++) {
                temp = data[i];
                for (j = i; j >= increment; j -= increment) {
                    //如想从小到大排只需修改这里
                    if(temp > data[j - increment]) {
                        data[j] = data[j - increment];
                    } else {
                        break;
                    }

                }
                data[j] = temp;
            }
        }
    }
}
