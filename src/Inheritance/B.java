package Inheritance;

class B
{
	int i;
	void test1(B b)
	{
		b.i=i;
	}
	public static void main(String[] args)
	{
		B b1=new B();
		B b2=new B();
		b1.i=10;
		b2.i=20;
		b1.test1(b2);
		System.out.println(b1.i);
		System.out.println(b2.i);
		System.out.println("-------------------");
		b1.i=10;
		b2.i=20;
		b2.test1(b1);
		System.out.println(b1.i);
		System.out.println(b2.i);
	}
}