package zuoye;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};//ʹ�ö��ֲ���ʱ�������е�����Ҫ����
       System.out.print("��ʼ���飺");
		  for (int i = 0; i < arr.length -1;i++)
	        {
			  	
	            System.out.print(arr[i] + ",");
	            
	        }
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("��������Ҫ��ѯ��λ�����֣�");
      
        int start = 0;
        int end = arr.length - 1;
        int pare = sc.nextInt();// ��scanner �ڿ���̨����Ҫ���ҵ�����
        while (start <= end) {
            int mid = (start + end) / 2;
            int midVla = arr[mid];
            if (midVla == pare) {
                System.out.println("���ҵ�����λ��Ϊ��" + mid);
                break;// ����ҵ����������������ѭ��
            } else if (midVla < pare) { //���mid��ֵС��Ҫ���ҵ�ֵ���������һ�벿�ֽ��в��Ҵ�ʱ�Ŀ�ʼ���mid+1��end����
                start = mid + 1;
            } else {     //���mid��ֵ����Ҫ���ҵ�ֵ��������ǰһ�벿�ֽ��в��Ҵ�ʱ��end�����mid-1��start����
                end = mid - 1;
            }
        }

    }
}