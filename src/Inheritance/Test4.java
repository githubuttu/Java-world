package Inheritance;

class Test4
{
	void test()
	{
		System.out.println("test"+this);
	}
	public static void main(String[] args)
	{
		Test4 t1 =new Test4();
		System.out.println("main"+t1);
		t1.test();
	}
}