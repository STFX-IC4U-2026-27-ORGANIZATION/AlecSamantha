package assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import assignments.PhoneObject;

public class PhoneDBMethods {

	// DESCRIPTION - Returns Phone[] populated with Phone objects from file.

	
	// DESCRIPTION - Returns PhoneObject[] populated with PhoneObject objects from file. 
	// PARAMETERS - String fileName 
	// RETURN - Phone[]
		
	// RETURN - PhoneObject[]
	public static PhoneObject[] loadPhonesFromFile(String fileName)  {
		ArrayList<PhoneObject> temp = new ArrayList<PhoneObject>();
		BufferedReader br = null;
		String word = "";
		try {
			
			br = new BufferedReader(new FileReader(fileName));
			
			while ((word = br.readLine()) != null) {
				
				temp.add(new PhoneObject(word, br.readLine(), br.readLine(), Integer.parseInt((br.readLine()))));
			}
			
			System.out.println("Successfully Read File");
			
			br.close();
			
		} catch(Exception e) {
			
			System.out.println("Failed to Read File");
		}
		
		PhoneObject[] phoneArray = new PhoneObject[temp.size()];
		
		return temp.toArray(phoneArray);
		
	}
	
	// DESCRIPTION - Returns index of PhoneObject in PhoneObject[] if brand matches reference, -1 if not found.
	// PARAMETERS - PhoneObject[] a, String ref, int index
	// RETURN - int
	public static int phoneSearchBrand(PhoneObject[] a, String ref, int index)  {
		
		if (index == a.length) {
			return -1;
		}

		if (a[index].getBrand() == ref) {
			return index;
		}
		
		
		return phoneSearchBrand(a, ref, index + 1);
	}
	
	// DESCRIPTION - Returns index of PhoneObject in PhoneObject[] if model matches reference, -1 if not found.
	// PARAMETERS - PhoneObject[] a, String ref, int index
	// RETURN - int
	public static int phoneSearchModel(PhoneObject[] a, String ref, int index)  {
		
		if (index == a.length) {
			return -1;
		}

		if (a[index].getModel() == ref) {
			return index;
		}
		
		
		return phoneSearchModel(a, ref, index + 1);
	}
}

/*
else if (a[index].getColor() == ref) {
	return index;
}
else if (Integer.toString(a[index].getLens()) == ref) {
	return index;
*/
