package malak.project1.book;

public abstract class Contact {
	protected String name;
protected int phone;
	protected String email; //protected to be inherited in the same package
	
	public Contact(String name , int phone , String email)
	{
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	 public void display()
	 {
		 System.out.println("name " +name);
		 System.out.println("phone " +phone);
		 System.out.println("email " +email);
		 
	 }


}
