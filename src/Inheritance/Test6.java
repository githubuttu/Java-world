package Inheritance;

class Test6
{
	int i;
	void test()
	{
		i=10;
	}
	public static void main(String[] args)
	{
		Test6 t1=new Test6();
		System.out.println(t1.i);
		t1.test();
		System.out.println(t1.i);
	}
}