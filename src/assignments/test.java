package assignments;

public class test {
	
	public static void main(String[] args) {
		
		String fileName = "src/Phone.txt"; 
		
		PhoneObject[] phones = PhoneDBMethods.loadPhonesFromFile(fileName);
		
		String ref = "iPhone";
		int index = 0;
		
		
		System.out.println(PhoneDBMethods.phoneSearchBrand(phones, ref, index));
	}
}
