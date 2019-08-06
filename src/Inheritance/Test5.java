package Inheritance;

class Test5
{
	void test()
	{
		System.out.println("test"+this);
	}
	public static void main(String[] args)
	{
		Test5 t1=new Test5();
		Test5 t2 = new Test5();
		System.out.println("main:  "+t1);
		t1.test();
		System.out.println("---------------");
		System.out.println("main:  "+t2);
		t2.test();
	}
}