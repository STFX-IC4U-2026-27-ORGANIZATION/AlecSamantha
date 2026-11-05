package assignments;
public class test {
	public static void main(String[] args) {
		
	
		// Test 1: Loads the student file
		Phone[] myPhone = PhoneDBMethods.loadPhonesFromFile("src/BookList11.txt");
	   	
	    // Test 2: Number of books
       System.out.println("Number of books: " + myPhone.length);
       
	}
	
}
