package Inheritance;

class A
{
	int i;
	void test1()
	{
		System.out.println("from test1:"+i);
		i=10;
		test2();
	}
	void test2()
	{
		System.out.println("from test2:"+i);
		i=20;
	}
	public static void main(String[] args)
	{
		A a1=new A();
		System.out.println("main1:"+a1.i);
		a1.test1();
		System.out.println("main2:"+a1.i);
		a1.i=30;
		a1.test2();
		System.out.println("main3:"+a1.i);
	}
}