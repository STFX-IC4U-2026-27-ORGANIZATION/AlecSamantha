package assignments;
import assignments.PhoneObject;

public class test {
	public static void main(String[] args) {
<<<<<<< HEAD
				
	// Create three instances
				
	PhoneObject myPhone = new PhoneObject("iPhone", "Duo", "white", 2);
				
	// Print out
	System.out.println(myPhone);
				
	}
}
=======
		
	
		// Test 1: Loads the student file
		PhoneObject[] myPhone = PhoneDBMethods.loadPhonesFromFile("src/Phone.txt");
	   	
	    // Test 2: Number of books
       System.out.println("Number of Phones: " + myPhone.length);
	   	
	   	// Test 3: Output all books from file
	   		for (int i = 0; i < myPhone.length; i++) {
	   		    System.out.println(myPhone[i].getBrand() + " "
	   		        + myPhone[i].getColor() + " "
	   		        + myPhone[i].getModel() + " " + myPhone[i].getLens());
	   			}
	   		}
	   		
	   }
>>>>>>> branch 'main' of https://github.com/STFX-IC4U-2026-27-ORGANIZATION/AlecSamantha.git
