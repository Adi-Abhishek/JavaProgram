class A{
	void msg()
	{
		System.out.println("Hi,This is a class A");
	}
}
class Default{
	public static void main(String args[]){
		A obj=new A();
		obj.msg();
	}
}