public class TypeCastingDemo{
	public static void main(String[] args) {
	//local variables
	
	float price = 99.75F;
	int totalPrice = (int) price; // explicit casting or narrowing
	
	System.out.println("The value of price is " + price);
	System.out.println("The value of totalPrice is" +      totalPrice);
				
	}
	
}