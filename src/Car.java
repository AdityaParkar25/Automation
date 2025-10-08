
public class Car {
	int wheels = 4;
	int seats = 6;
	String color = "Black";
	String company = "BMW";

	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.color);
		System.out.println(c1.wheels);
		System.out.println(c1.seats);
	}

}
