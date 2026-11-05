package assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import assignments.Phone;

public class PhoneDBMethods {
	// DESCRIPTION - Returns Book[] populated with Book objects from file. 
	// PARAMETERS - String fileName 
	// RETURN - Book[]
	public static Phone[] loadPhonesFromFile(String fileName)  {
		ArrayList<Phone> temp = new ArrayList<Phone>();
		BufferedReader br = null;
		String word = "";
		try {
			
			br = new BufferedReader(new FileReader(fileName));
			
			while ((word = br.readLine()) != null) {
				
				temp.add(new Phone(word, br.readLine(), br.readLine(), br.readLine()));
			}
			
			br.close();
			
		} catch(Exception e) {
			
			System.out.println("Failed to Read File");
		}
		
		Phone[] phoneArray = new Phone[temp.size()];
		
		return temp.toArray(phoneArray);
		
	}
}
