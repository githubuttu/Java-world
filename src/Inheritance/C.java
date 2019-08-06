package Inheritance;

class C
{
	int i;
	void test1(C c1, C c2)
	{
		int i=c1.i;
		c1.i=c2.i;
		c2.i=i;
		System.out.println("iiiii"+i);
	}
	void test2(C c1)
	{
		int i=this.i;
		System.out.println("i====="+i);
		System.out.println("c1.i"+c1.i);
		this.i=c1.i;
		c1.i=i;
	}
	public static void main(String[] args)
	{
		C c1=new C();
		C c2=new C();
		c1.i=1;
		c2.i=2;
		c1.test1(c1, c2);
		System.out.println(c1.i+" "+c2.i);
		c1.test2(c2);
		System.out.println(c1.i+" "+c2.i);
	}
}