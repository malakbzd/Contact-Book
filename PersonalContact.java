package malak.project1.book;

public class PersonalContact extends Contact {
private String relationship;
	public PersonalContact(String name, int phone, String email , String relationship) {
		super(name, phone, email);
		// TODO Auto-generated constructor stub
		this.relationship = relationship;
	}

	public void display()
	 {
		 super.display();
		 System.out.println("relationship " +relationship);
		
		
	 }
}
