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
		System.out.println("*******欢迎来到超市**********");
		System.out.println("1.逛一逛 购买商品给\t2.离开、结账离开");
		
		Scanner sc=new Scanner(System.in);
		
		boolean flag=true;
		
		while(flag) {
			
			
			switch(sc.nextLine()){
			case"1":	
				System.out.println("请输入所购买的商品名称：");
				String name=sc.nextLine();
				
				System.out.println("请输入商品单价：");
				String price=sc.nextLine();
				float price2=Float.parseFloat(price);
				
				
				System.out.println("请输入商品数量：");
				String num=sc.nextLine();
				int num2=Integer.parseInt(num);
				System.out.println("继续购买吗？1.继续\t2.结账");
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
				System.out.println("操作有误！");
				break;
			default:
				
				break;
			
			}
			
			
		}
		//结算
		
		//判断
		if(index==0) {
			System.out.println("========欢迎下次光临========");
			return;
		};
		
		
		System.out.println("请输入折扣");
		String zk=sc.nextLine();
		int zk2=Integer.parseInt(zk);		
		float realPrice=allPrice*zk2/10;
		
		System.out.println("原价："+allPrice);
		System.out.println("实际消费："+realPrice);
		

		System.out.println("开始结算，请输入支付金额");
		String money=sc.nextLine();
		float money2=Float.parseFloat(money);
		
		System.out.println("名称\t单价\t数量\t小计");
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
		
		System.out.println("找零"+(money2-realPrice));
		
		
		System.out.println("========欢迎下次光临========");
	}
	

}