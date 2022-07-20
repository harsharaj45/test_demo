package student.details;

public class StudentDetails {
	
	

	public static void main(String[] args) {
		Student objSt=new Student();
		objSt.setName("harsha");
		objSt.setRollNo(1010);
		Address objAddr=new Address();
		objAddr.setHouseNo(87);
		objAddr.setCity("Kollam");
		objAddr.setPin(689711);
		objAddr.setStudent(objSt);
		objAddr.display();
				
		

	}

}
