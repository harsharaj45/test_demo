package multilevel.inheritance;

public class Child extends Intermediate {
	public void displayChild()
	{
		System.out.println("child class method");
		count=10;
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.displayChild();
		obj.displayInter();
		obj.displayParent();
		
		
		

	}

}
