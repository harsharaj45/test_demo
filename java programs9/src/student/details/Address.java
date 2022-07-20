package student.details;

public class Address {
	private int houseNo;
	private String city;
	
	private int pin;
	private Student student;
	
	
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void display()
	{
		System.out.println("student name : "+student.getName());
		System.out.println("student roll no : "+getStudent().getRollNo());
		System.out.println("Address");
		System.out.println("house no: "+houseNo);
		System.out.println("city: "+getCity());
		System.out.println("pin "+getPin());
	
	}
	
	

}
