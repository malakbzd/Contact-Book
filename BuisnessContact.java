package malak.project1.book;



public class BuisnessContact extends Contact {
	private String company;
	private String job;

public BuisnessContact(String name, int phone, String email , String company , String job) {
		super(name, phone, email);
		// TODO Auto-generated constructor stub
		this.company = company;
		this.job = job;
	}
 public void display()
 {
	 super.display();
	 System.out.println("company " +company);
	 System.out.println("job " +job);
	
 }
}
