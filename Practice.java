public class Practice {

	public static void main(String[] args){
	
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a = 10;
		int b = 20;
		int c = a > b ? a : b;           //c = a大于b吗   如果大于 c=a  ：（否则） c=b；
		//                                 c = a大于b吗   如果大于 c=a  ：（否则） c=b；		
		System.out.println(c);
		

		/*
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a = 10;
		int b = 20;
		int c;
		if(a > b){
				c = a;
		}else{  c = b;
	}
		System.out.println(c);
			*/
		
		
		//每消费100元减20元折扣
		
		/*
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("输入你消费的金额");
		int money = input.nextInt();
		
		if(money > 100){
				int n = money / 100;
				money = money - 20 * n;
		
		}
		System.out.println("应该支付的金额为：" + money);
		*/
		
		
		
		
		/*
		//消费100减20元
		
		java.util.Scanner input = new java.util.Scanner(System.in);	

		System.out.println("输入你消费的金额");
		int money = input.nextInt();
		
		if(money > 100){
			money -= 20;
		}
		System.out.println("你需要支付的金额为：" + money + "元");
		*/
		
		
		/*
		//逻辑运算符 &&（满足两者 缺一不可）          || （任意满足其一）
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("请输入用户名");
		String name = input.next();
		
		System.out.println("请输入密码");
		String password = input.next();
		
		if(name.equals("tom") && password.equals("123")) {                //&& 并且  满足前面的条件 并且满足后面的条件
			System.out.println("登陆成功");
		} else{
			System.out.println("用户名或密码错误");
		}
		*/
		
		/*
		java.util.Scanner input = new java.util.Scanner(System.in);
	
		System.out.println("输入第一个数字");
		int a = input.nextInt();
	
		System.out.println("输入第二个数字");
		int b = input.nextInt();

		int temp = a;
			   a = b;
			   b = temp;
	
		System.out.println("第一个输入的数字为：" + a + "第二个输入的数字为：" + b);
		*/
		
		
		
		
		
		
		
		
		
		
	/*
	java.util.Scanner input = new java.util.Scanner(System.in);
	
	System.out.println("请输出您的姓名");
	String name = input.next();
	
	System.out.println("请输入您的年龄");
	int age = input.nextInt();
	
	System.out.println("欢迎您，" + name + "，您的年龄是" + age + "岁。");
	*/
		
	
		/*
		double num = 10 / (int)3.0;
		System.out.println(num);
		;*/
		
		/*
		byte a = 10;
		byte b = 20;
		byte c = a + b; 
		
		System.out.println(c);
		*/
	
		/*
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("请输入你的姓名");
		String name = input.next();
		
		System.out.println("输入第一个数字");
		int a = input.nextInt();
		
		System.out.println("输入第二个数字");
		int b = input.nextInt();
		
		int temp = a;
			a = b;
			b = temp;
		
		System.out.println(name + "\t输入的第一个数字是；" + a + "输入的第二个数字是：" + b);
		*/
	
	
	}


}