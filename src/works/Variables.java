package works;

public class Variables {

	int a =10;
	byte b = -127;
	boolean flag = true;
	double d= 19.9;
	
	
	
	void print() {
		String mesg ="hello all";
		System.out.println(mesg);
	}
	
	static String message = "Hello i'm static variable";
	public static void main(String[] args) {
		int x = 10;
		short y =(short) x;
		System.out.println(y);
		
		Variables ob = new Variables();
		
		System.out.println("the value  of a " +ob.a);
		
		ob.print();
		System.out.println(message);
		
		// TODO Auto-generated method stub

	}

}


