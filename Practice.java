public class Practice {

	public static void main(String[] args){
	
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a = 10;
		int b = 20;
		int c = a > b ? a : b;           //c = a����b��   ������� c=a  �������� c=b��
		//                                 c = a����b��   ������� c=a  �������� c=b��		
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
		
		
		//ÿ����100Ԫ��20Ԫ�ۿ�
		
		/*
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("���������ѵĽ��");
		int money = input.nextInt();
		
		if(money > 100){
				int n = money / 100;
				money = money - 20 * n;
		
		}
		System.out.println("Ӧ��֧���Ľ��Ϊ��" + money);
		*/
		
		
		
		
		/*
		//����100��20Ԫ
		
		java.util.Scanner input = new java.util.Scanner(System.in);	

		System.out.println("���������ѵĽ��");
		int money = input.nextInt();
		
		if(money > 100){
			money -= 20;
		}
		System.out.println("����Ҫ֧���Ľ��Ϊ��" + money + "Ԫ");
		*/
		
		
		/*
		//�߼������ &&���������� ȱһ���ɣ�          || ������������һ��
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("�������û���");
		String name = input.next();
		
		System.out.println("����������");
		String password = input.next();
		
		if(name.equals("tom") && password.equals("123")) {                //&& ����  ����ǰ������� ����������������
			System.out.println("��½�ɹ�");
		} else{
			System.out.println("�û������������");
		}
		*/
		
		/*
		java.util.Scanner input = new java.util.Scanner(System.in);
	
		System.out.println("�����һ������");
		int a = input.nextInt();
	
		System.out.println("����ڶ�������");
		int b = input.nextInt();

		int temp = a;
			   a = b;
			   b = temp;
	
		System.out.println("��һ�����������Ϊ��" + a + "�ڶ������������Ϊ��" + b);
		*/
		
		
		
		
		
		
		
		
		
		
	/*
	java.util.Scanner input = new java.util.Scanner(System.in);
	
	System.out.println("�������������");
	String name = input.next();
	
	System.out.println("��������������");
	int age = input.nextInt();
	
	System.out.println("��ӭ����" + name + "������������" + age + "�ꡣ");
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
		
		System.out.println("�������������");
		String name = input.next();
		
		System.out.println("�����һ������");
		int a = input.nextInt();
		
		System.out.println("����ڶ�������");
		int b = input.nextInt();
		
		int temp = a;
			a = b;
			b = temp;
		
		System.out.println(name + "\t����ĵ�һ�������ǣ�" + a + "����ĵڶ��������ǣ�" + b);
		*/
	
	
	}


}