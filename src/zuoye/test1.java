package zuoye;


import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		
		String[] names=new String[5];
		float[] prices=new float[5];
		int[] nums=new int[5];
		float[] xjs=new float[5];
		
		float allPrice=0f;
		
		int index=0;
		System.out.println("*******��ӭ��������**********");
		System.out.println("1.��һ�� ������Ʒ��\t2.�뿪�������뿪");
		
		Scanner sc=new Scanner(System.in);
		
		boolean flag=true;
		
		while(flag) {
			
			
			switch(sc.nextLine()){
			case"1":	
				System.out.println("���������������Ʒ���ƣ�");
				String name=sc.nextLine();
				
				System.out.println("��������Ʒ���ۣ�");
				String price=sc.nextLine();
				float price2=Float.parseFloat(price);
				
				
				System.out.println("��������Ʒ������");
				String num=sc.nextLine();
				int num2=Integer.parseInt(num);
				System.out.println("����������1.����\t2.����");
				float xj=num2*price2;
				
				allPrice+=xj;
				
				
				names[index]=name;
				prices[index]=price2;
				nums[index]=num2;
				xjs[index]=xj;
				index++;
				
				break;
			case"2":
				flag=false;
			
			
			break;
			
			case "":
				System.out.println("��������");
				break;
			default:
				
				break;
			
			}
			
			
		}
		//����
		
		//�ж�
		if(index==0) {
			System.out.println("========��ӭ�´ι���========");
			return;
		};
		
		
		System.out.println("�������ۿ�");
		String zk=sc.nextLine();
		int zk2=Integer.parseInt(zk);		
		float realPrice=allPrice*zk2/10;
		
		System.out.println("ԭ�ۣ�"+allPrice);
		System.out.println("ʵ�����ѣ�"+realPrice);
		

		System.out.println("��ʼ���㣬������֧�����");
		String money=sc.nextLine();
		float money2=Float.parseFloat(money);
		
		System.out.println("����\t����\t����\tС��");
		for (int i = 0; i < i; i++) {
			String name= names[i];
			float price=prices[i];
			int num=nums[i];
			float xj=xjs[i];
			
			System.out.print(name);
			System.out.print("\t");
			System.out.print(price);
			System.out.print("\t");
			System.out.print(num);
			System.out.print("\t");
			System.out.println(xj);
			
			
		}
		
		System.out.println("����"+(money2-realPrice));
		
		
		System.out.println("========��ӭ�´ι���========");
	}
	

}