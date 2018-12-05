package interviewoffer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 找出数组中重复的数字
 */
public class Demo03 {

    //找到重复的数字
    public int find(int[] number) {
        for (int i = 0; i < number.length; i++)
            if (number[i] < 0 || number[i] >= number.length)
                return -1;
        int length = number.length;
        int m;
        for (int i = 0; i <= length - 1; ++i) {
            while(number[i] != i){
                if(number[i] == number[number[i]])
                    return number[i];
                swap(number,i,number[i]);
            }
        }
        return -1;
    }
    public void swap(int[] number,int a,int b){
        //交换两个数字
         number[a] = number[a] + number[b];
        number[b] = number[a] - number[b];
        number[a] = number[a] - number[b];
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int length = 0;
       int count = 0;
       if (scanner.hasNextInt())
           length = scanner.nextInt();
       int[] number = new int[length];
       while(scanner.hasNextInt()){
           number[count++] = scanner.nextInt();
       }
        Demo03 demo03 = new Demo03();
        int result = demo03.find(number);
        System.out.println(result);
    }
}
