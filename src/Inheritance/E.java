package Inheritance;
class D
{
	private static D obj=null;
	static
	{
		obj=new D();
	}
	private D()
	{
		System.out.println("D()");
	}
	public static D getObject()
	{
		return obj;
	}
}
class E {

	public static void main(String[] args) {
D d2=D.getObject();
D d3=D.getObject();
D d4=D.getObject();
D d5=D.getObject();
D d6=D.getObject();
System.out.println(d2);
System.out.println(d3);
System.out.println(d4);
	}

}
