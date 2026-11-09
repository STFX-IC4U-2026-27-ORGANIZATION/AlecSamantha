package assignments;
import assignments.PhoneObject;

public class test {
	public static void main(String[] args) {

	// Test 1: Loads the student file
		PhoneObject[] myPhone = PhoneDBMethods.loadPhonesFromFile("src/Phone.txt");
	   	
	// Test 2: Number of books
       System.out.println("Number of Phones: " + myPhone.length);
	   	
	// Test 3: Output all books from file
	   	System.out.println("");
	   	}
	   		
	  }
