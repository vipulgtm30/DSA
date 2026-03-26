package lambdaExpressions;

@FunctionalInterface
interface Cab{
	
	public String bookCab(String source, String destination);
	
}

public class Solution {

	public static void main(String[] args) {
//		Cab cab = (source, destination) -> System.out.println("Uber cab is booked");;
//		cab.bookCab();
		
//		Cab cab = new Ola();
//		cab.bookCab("Khanpur", "Gurugram");
		
		Cab cab = (source, destination) -> {
			System.out.println("Ola cab is booked from: " +source+ " to " +destination);
			return "Price: 5000Rs";
			
		};
		String price = cab.bookCab("Khanpur", "Noida");
		System.out.println(price);
	}

}
