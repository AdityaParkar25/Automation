
public class House {
	int rooms = 4;
	String color = "White";
	int floor = 2;

	public static void main(String[] args) {
		House a1 = new House();
		System.out.println(a1);  //this will give the address of the variable a1
		System.out.println(a1.rooms); // a1 will now have all the attributes of class House
		System.out.println(a1.color);
		System.out.println(a1.floor);

	}

}
