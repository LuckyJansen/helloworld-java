package algorithm;

import java.util.ArrayList;

/**
 * @description: File–Setting–Editor–File and Code Templates–Class
 * @author: Gaojianxin
 * @time: 2020/1/14 14:43
 */
public class SortDemo {

    public static void main(String[] args) {

        int[] arrayList = new int[]{6,2,3,3,2,1};
        System.out.println(arrayList.length);
        arrayToString(arrayList);
        //arrayToString(bubbleSort(arrayList));
        arrayToString(selectionSort(arrayList));

    }

    /**
     * 1.冒泡排序：相邻两个元素比较大小，最后最大的数据冒出，一趟完成，然后循环进行
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
     * 2.选择排序：在未排序序列中，找到最大的数据，放在第1位，再从剩余中未排序序列中找到最大数据，依次排列
     * @param array
     * @return
     */
    public  static int[] selectionSort(int[] array){
        int maxIndex=0;
        for(int i =0; i<array.length-1; i++){
            maxIndex = i;
            //选择排序第二个循环是从i+1开始
            for(int j =i+1; j<array.length; j++){
                if(array[maxIndex] < array[j]){
                    maxIndex = j;
                }
            }
            //每次找出未排序最大的值，就与最左端互换位置，这样遍历就是每次选择出最大的元素了
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;

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
