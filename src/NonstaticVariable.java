
public class NonstaticVariable {
	int a = 20;

	public static void main(String[] args) {
		
		NonstaticVariable n1 = new NonstaticVariable();
		n1.a = 30;
		n1.test();

	}
	
	void test() {
		System.out.println(a);
	}

}
