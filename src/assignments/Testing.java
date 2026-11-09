<<<<<<< HEAD
=======
package assignments;

public class Testing {

	public static void main(String[] args) {
		PhoneObject[] phones = PhoneDBMethods.loadPhonesFromFile("src/Phone.txt");
		
		for (int i = 0; i < phones.length; i++) {
			System.out.println(phones[i].getBrand() + " " + phones[i].getModel() + " " + phones[i].getColor() + " " + phones[i].getLens());
		}
		
		
	}

}
>>>>>>> branch 'main' of https://github.com/STFX-IC4U-2026-27-ORGANIZATION/AlecSamantha.git
