package malak.project1.book;

import java.util.ArrayList;


public class ContactBook implements Manageable{
 private ArrayList<Contact> contacts ;
 private String name;
 
 public ContactBook(String name)
 {
	 this.name = name;
	 contacts = new ArrayList<>();
 }

@Override
public void add(Contact contact) {
	// TODO Auto-generated method stub
	contacts.add(contact);
}

@Override
public Contact search(String name) {
	// TODO Auto-generated method stub
	for(Contact contact : contacts) // iterates over each Contact object in the collection contacts
	{
		if(contact.name.equals(name))
		{
			return contact;
		}
	}
	return null;
}

@Override
public boolean remove(String name) {
	// TODO Auto-generated method stub
	Contact contact = search(name); //searches for a Contact object in the contacts list.
	if(contact != null)
	{
		contacts.remove(contact);
		return true;
	}
	return false;
}

@Override
public boolean shareContact(String name, ContactBook targetContactBook) //targetContactBook → The destination where the contact should be added. 
{
	// TODO Auto-generated method stub
	 Contact contact = search(name); //Calls a search(name) method to find a contact with the given name in the current contact book.
	 if(contact != null)
	 {
		 targetContactBook.add(contact);
		 return true;
	 }
	return false;
}
 
public void display()
{
	System.out.println("Owner's Name: " + name);
    System.out.println("Contacts: ");
    
    if (contacts.isEmpty()) {
        System.out.println("No contacts available.");
    } else {
        for (Contact contact : contacts) {
            contact.display(); // Calls the display() method of BusinessContact/PersonalContact
            System.out.println("----------------------------");
        }
    }
}

}
