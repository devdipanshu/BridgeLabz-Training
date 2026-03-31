import java.util.ArrayList;
import java.util.HashSet;
class InvalidPhoneNumberException extends Exception{
	InvalidPhoneNumberException(String msg){
		super(msg);
	}
}
class Contact{
	private String name;
	private String phoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return phoneNumber;
	}
	Contact(String name,String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
}
public class PhoneContactOrganizer {
	public static void addContact(ArrayList<Contact> list,String name,String number,HashSet<String> hs) throws InvalidPhoneNumberException {
		if(number.length()!=10) {
			throw new InvalidPhoneNumberException("Invalid Phone Number");
		}
		if(hs.contains(number)) {
			System.out.println("Number is already saved");
			return;
		}
		Contact contact = new Contact(name,number);
		list.add(contact);
		hs.add(number);
	}
	public static void removeContact(ArrayList<Contact> list,String name,String number,HashSet<String> hs) {
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).getName().equals(name) && list.get(i).getNumber().equals(number)) {
		        list.remove(i);
		        hs.remove(number);
		        break;
		    }
		}
	}
	public static void searchWithName(ArrayList<Contact> list,String name) {
		for(Contact key: list) {
			if(key.getName().equals(name)) {
				System.out.println("Name: "+key.getName());
				System.out.println("Contact Number: "+key.getNumber());
			}
		}
	}
	public static void searchWithNumber(ArrayList<Contact> list,String number) {
		for(Contact key: list) {
			if(key.getNumber().equals(number)) {
				System.out.println("Name: "+key.getName());
				System.out.println("Contact Number: "+key.getNumber());
			}
		}
	}
	public static void main(String[] args) throws InvalidPhoneNumberException {
		ArrayList<Contact> list = new ArrayList<>();
		HashSet<String> hs = new HashSet<>();
		try {
			addContact(list,"rajan","12356789",hs);
			searchWithName(list,"rajan");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
