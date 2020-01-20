package algorithm;

import java.util.ArrayList;

/**
 * @description: File–Setting–Editor–File and Code Templates–Class
 * @author: Gaojianxin
 * @time: 2020/1/14 14:43
 */
public class SortDemo {

    public static void main(String[] args) {

        int[] arrayList = new int[]{6,2,3,1};
        System.out.println(arrayList.length);
        arrayToString(arrayList);
        arrayToString(bubbleSort(arrayList));
    }

    /**
     * 冒泡排序：相邻两个元素比较大小，最后最大的数据冒出，一趟完成，然后循环进行
     * @param array
     * @return
     */
    public  static int[] bubbleSort(int[] array){
        for(int i =0; i<array.length-1;i++){
            //冒泡排序第二个循环的开始也是从0开始
            for(int j =0; j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 打印数组内容
     * @param arryList
     */
    public static void arrayToString(int[] arryList){
        StringBuffer sb = new StringBuffer();
        for(int a : arryList){
            sb = sb.append(a+" ");
        }
        System.out.println(sb.toString());
    }
}
