package malak.project1.book;

import java.util.Scanner;

public class ContactBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create two instances
		ContactBook contactbook1 = new ContactBook("malak");
        Scanner in = new Scanner(System.in);
        
        int J=1 , phone;
        String name , job , company , relationship , email;  
        
         while(J==1)
         {
        	 System.out.println("**PICK AN OPTION**");
        	 System.out.println("1/ ADD TO BUISNESS CONTACT");
        	 System.out.println("2/ ADD TO PERSONAL CONTACT");
        	 System.out.println("3/ SEARCH FOR CONTACT");
        	 System.out.println("4/ REMOVE CONTACT");
        	 System.out.println("5/ SHARE A CONTACT");
        	 System.out.println("6/ DISPLAY ALL CONTACTS");
        	 System.out.println("7/ EXIT");
        	 System.out.println("pick an option");
        	 int option = in.nextInt();
        	 in.nextLine();
        	 switch(option){
        	 
        	 case 1 :
        		 System.out.println("enter ur name");
        	      name = in.nextLine();
        		 System.out.println("enter ur phone number");
        	      phone = in.nextInt();
        	      in.nextLine();
        		 System.out.println("enter ur email");
        		  email = in.nextLine();
        		 System.out.println("enter ur company");
        		  company = in.nextLine();
        		 System.out.println("enter ur job");
        		  job = in.nextLine();
        		 contactbook1.add(new BuisnessContact(name, phone, email, company, job ));
        		 System.out.println("done");
        		 System.out.println("_________________________________________________________");
        		 
        		 
        		 break;
        		 
        	 case 2 :
        		 System.out.println("enter ur name");
        		  name = in.nextLine();
        		 System.out.println("enter ur phone number");
        	      phone = in.nextInt();
        	      in.nextLine();
        		 System.out.println("enter ur email");
        		  email = in.nextLine();
        		 System.out.println("enter ur relationship");
        		  relationship = in.nextLine();
        		 contactbook1.add(new PersonalContact(name, phone, email, relationship));
          		 System.out.println("done");
          		System.out.println("_________________________________________________________");
          		 
          		 break;
          		 
        	 case 3 :
          		 System.out.println("enter ur name");
          		 name = in.nextLine();
          		Contact foundContact = contactbook1.search(name);
          	    if (foundContact != null) {
          	        System.out.println("Contact found:");
          	        foundContact.display(); // Calls the display() method of Contact
          	    } else {
          	        System.out.println("Contact not found!");
          	    }
          	  System.out.println("_________________________________________________________");
          		 
          		  break;
          		  
        	 case 4 :
        		 System.out.println("enter ur name");
          		 name = in.nextLine();
          		 contactbook1.remove(name);
          		System.out.println("_________________________________________________________");
          		 
          		 break;
          		 
        	 case 5 :
        		 System.out.println("enter ur name");
          		 name = in.nextLine();
          		 contactbook1.shareContact(name, contactbook1);
          		System.out.println("_________________________________________________________");
          		 
          		 break;
          		 
          		 
        	 case 6 :
        		 contactbook1.display();
        		 System.out.println("_________________________________________________________");
        		 break;
        		 
        	 case 7 :
        		 J=0;
        	 }
        	 
        	 
        	  {
        	 
        	 }
        	 
        	 
         }
		
		
	}
	

}
