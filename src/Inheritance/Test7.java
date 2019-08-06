package Inheritance;

class Test7
{
	int i;
	void method1()
	{
		i=10;
	}
	void method2()
	{
		System.out.println("method2: "+i);
	}
	public static void main(String[] args)
	{
		Test7 t1=new Test7();
		System.out.println("main1: "+t1.i);
		t1.method1();
		System.out.println("main2: "+t1.i);
		t1.method2();
		System.out.println("main3: "+t1.i);
	}
}