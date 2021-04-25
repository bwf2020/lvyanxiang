package zuoye;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};//使用二分查找时，数组中的数据要有序；
       System.out.print("初始数组：");
		  for (int i = 0; i < arr.length -1;i++)
	        {
			  	
	            System.out.print(arr[i] + ",");
	            
	        }
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("请输入你要查询的位置数字：");
      
        int start = 0;
        int end = arr.length - 1;
        int pare = sc.nextInt();// 用scanner 在控制台输入要查找的数据
        while (start <= end) {
            int mid = (start + end) / 2;
            int midVla = arr[mid];
            if (midVla == pare) {
                System.out.println("已找到数字位置为：" + mid);
                break;// 如果找到了这个数字则跳出循环
            } else if (midVla < pare) { //如果mid的值小于要查找的值，则会进入后一半部分进行查找此时的开始变成mid+1，end不变
                start = mid + 1;
            } else {     //如果mid的值大于要查找的值，则会进入前一半部分进行查找此时的end变成了mid-1，start不变
                end = mid - 1;
            }
        }

    }
}