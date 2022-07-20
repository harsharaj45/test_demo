package inheritance;

public class Child2 extends Parent
{
public void print()
	{
		System.out.println("third class method");
	}

	public static void main(String[] args) {
		Child2 obj=new Child2();
		//obj.sayHello(30);
		
		obj.print();

	}

}
