package co.inTest1;

public class argslength {
	public static void main(String[] args) {
		if(args.length==3) {
			System.out.println("Hello" +args[0]+args[1]+args[2]);
		} else {
			System.out.println("Parameter name is required");
		}
		
	}

}
