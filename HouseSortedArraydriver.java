
public class HouseSortedArraydriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		house a = new house("a", 2000);
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
	System.out.println("index : " + arraytest.indexOf(a));
	System.out.println(arraytest.todisplay());
	System.out.println("remove: " + arraytest.remove(a));
	System.out.println(arraytest.todisplay());
	arraytest.add(c.getStreet(), c.getSquareFoot());
	System.out.println(arraytest.todisplay());
	System.out.println(arraytest.replace(c, b));
	System.out.println(arraytest.todisplay());
	System.out.println(arraytest.grab(0));
	
		
	}

}
