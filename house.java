
public class house implements Comparable<house> {
	private String street;
	private int squareFoot;


	public house(String street, int squareFoot) {
	super();
	this.street = street;
	this.squareFoot = squareFoot;
	}
	
	public String getStreet() {
		return street;
	}

	public int getSquareFoot() {
		return squareFoot;
	}
	
	@Override
	public String toString() {
		return "house [street=" + street + ", squareFoot=" + squareFoot + "]"+"\n";
	}
	public boolean equals(house other) {
		boolean output = false;
		if (other != null) {
		if (this.squareFoot == other.getSquareFoot() & this.street.equalsIgnoreCase(other.getStreet())){
			output = true;
		}}
		return output;
	}
	public int compareTo(house other) {
		int output = 0;
		if(other != null) {
		output = this.street.compareToIgnoreCase(other.street);
		if (output < 0) {output = -1;}
		if (output > 0) {output = 1;}
		if (output == 0) {
			if(other.squareFoot < this.squareFoot) {output = -1;}
			if (other.squareFoot > this.squareFoot) {output = 1;}
		}}
		return output;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
house a = new house("a",1200);
house b = new house("a",1900);
house c = new house("a",1000);
house d= new house("A",100);
System.out.println("anser should be -1" + a.compareTo(b));
System.out.println("anser should be 1" + a.compareTo(c));
System.out.println("anser should be 0" + a.compareTo(d));
System.out.println(a.squareFoot == b.getSquareFoot() & a.street.equalsIgnoreCase(b.getStreet()));
System.out.println(a.equals(b));
System.out.println(a.toString());
	}

}
