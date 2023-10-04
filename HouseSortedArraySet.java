import java.util.Arrays;
import java.util.Iterator;

public class HouseSortedArraySet {
private house[] house;
private int numHouses;



	public HouseSortedArraySet(int house) {
	this.house = new house[house];
	this.numHouses = 0;
}

	
	public void add(String newStreet, int newSquareFoot) {
		house newhouse = new house(newStreet, newSquareFoot);
		boolean output = false;
		if (house[house.length -1] == null && house[0] == null) {
			house[house.length -1] = newhouse;
			numHouses++;}
		else numHouses++;
		for(int i=0;i<numHouses;i++) {
			if(newhouse.equals(house[i])) {
				output = true;
				break;}
			}
		
		if(output == false) {	
	
		int z = 0;
		int x = 1;
		for( z =house.length -1; z>0; z--) {
			if (newhouse.compareTo(house[z]) == 1 & z != house.length - 1) { 
				x++;}}
		
			
		for( z =house.length-1 ; z>x; z--) {
			house[z] = house[z-1];}
			
		house[z] = newhouse;
		
		
				
				}
	if(house[0] == null) {	
		for(int i = 0; i<house.length-1; i++) {
			house[i] = house[i+1];
		}}
	}
	
	public int size() {
		return house.length;
	}
	@Override
	public String toString() {
		return "HouseSortedArraySet [house=" + Arrays.toString(house) + ", numHouses=" + numHouses + "]";
	}
	public int indexOf(house houseFinder) {
		int output = -1;
		for(int i = 0; i < house.length; i++) {
			if(houseFinder.equals(house[i])) {
				output = i;
			}
		}
		return output;
	}
	public boolean remove(house removable) {
		boolean output = false;
		int position = indexOf(removable);
		if (position == -1) {return output;}
		for(int z =position; z>0; z--) {
			house[z] = house[z-1];}
			house[0] = null;
		for(int i = 0; i<house.length-1; i++) {
			house[i] = house[i+1];
		}
			house[house.length -1] = null;
			numHouses = numHouses -1;
			
		return true;
	}
	public house grab(int index) {
		house output = null;
		if (index < house.length) {
			output = house[index];
		}
		return output;
	}
	public boolean replace(house oldThing, house newThing) {
		boolean output = false;
		int position = indexOf(oldThing);
		int secondPosition = indexOf(newThing);
		if (position != -1 && secondPosition == -1) {
			remove(oldThing);
			add(newThing.getStreet(),newThing.getSquareFoot());
			output = true;
		}
		return output;
	}
	public boolean equals(house[] list) {
		boolean output = true;
		for (int i=0; i<house.length; i++) {
			if (house[i].equals(list[i]) == false) {
				output = false;
				break;
			}
		} return output;		
	}
	public static int total(HouseSortedArraySet set) {
		int output = 0;
		for (int i=0; i<set.house.length; i++) {
			if(set.house[i] != null) {
			output = output + set.house[i].getSquareFoot();
		}}
		return output;
	}
	public String todisplay() {
		String x = "";
		String y = "";
		for(int i=0; i<house.length; i++) {
			if(house[i] != null) {
				y = house[i].toString();
				x= x + y;}
		}
		return x;
	}
	public class HouseSortedArraySetIterator implements Iterator<house>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public house next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		house a = new house("a", 1200);
		house b = new house("b", 1800);
		house c = new house("d",2000);
		house d= new house("A",100);
		System.out.println("anser should be -1" + a.compareTo(b));
		System.out.println("anser should be 1" + a.compareTo(c));
		System.out.println("anser should be 0" + a.compareTo(d));
		System.out.println(a.getSquareFoot() == b.getSquareFoot() & a.getStreet().equalsIgnoreCase(b.getStreet()));
		System.out.println(a.equals(b));
		System.out.println(a.toString());
		HouseSortedArraySet arraytest = new HouseSortedArraySet(5);
		arraytest.add("a", 1200);
		System.out.println(arraytest.todisplay());
	arraytest.add("b", 1800);
	System.out.println(arraytest.todisplay());
	arraytest.add("C", 1900);
	System.out.println(arraytest.todisplay());
	arraytest.add("p", 1900);
	System.out.println(arraytest.todisplay());
	arraytest.add("A", 1900);
	System.out.println(arraytest.todisplay());
	System.out.println(arraytest.size());
	System.out.println("index : " + arraytest.indexOf(a)); //
	System.out.println(arraytest.grab(3));
	System.out.println(arraytest.todisplay());
	System.out.println("remove: " + arraytest.remove(b));
	System.out.println(arraytest.todisplay());
	System.out.println(arraytest.grab(0));
	System.out.println(arraytest.equals(arraytest));
	System.out.println(total(arraytest));	
	System.out.println("index : " + arraytest.indexOf(a));
	System.out.println(arraytest.todisplay());
	System.out.println("remove: " + arraytest.remove(a));
	System.out.println(arraytest.todisplay());
	arraytest.add(c.getStreet(), c.getSquareFoot());
	System.out.println(arraytest.todisplay());
	System.out.println(arraytest.replace(c, b));
	System.out.println(arraytest.todisplay());
	System.out.println(arraytest.grab(0));
	
		
}}


