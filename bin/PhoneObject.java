package assignments;

public class PhoneObject {

	// Data Members
	
	String Brand;
	String Color;
	String Model; 
	int Lens; 
	
	// Default constructor
	
	public PhoneObject() {
		
		this.Brand = "";
		this.Color = "";
		this.Model = "";
		this.Lens = 0; 
		
	}
	
	// Parameterize constructor 
	
	public PhoneObject(String b, String m, String c, int l) {
		
		this.Brand = b;
		this.Color = c;
		this.Model = m;
		this.Lens = l; 
		
	}
	
	// get methods
	
	public String getBrand() {
		
		return this.Brand;
		
	}
	
	public String getColor() {
		
		return this.Color;
		
	}
	
	public String getModel() {
		
		return this.Model;
		
	}
	
	public int getLens() {
		
		return this.Lens;
		
	}
	
	// set methods
	
	public void setBrand(String b) {
		
		this.Brand = b;
		
	}
	
	public void setColor(String c) {
		
		this.Color = c;
		
	}
	
	public void setModel(String m) {
		
		this.Model = m;
		 	
	}
	
	public void setLens(int l) {
		
		this.Lens = l;
		
	}
	
	@Override
	
	public String toString() {
		
		return super.toString() + "." + this.Brand + "." + this.Model + "." + this.Color + "." + this.Lens;
		
		}
	
	}