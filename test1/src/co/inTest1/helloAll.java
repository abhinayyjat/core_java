package co.inTest1;

public class helloAll {
	public static void main(String[] args) {
		int size=args.length;
		if(size==0) {
			System.out.println("Usage: java HelloAll n1 n2 n3..");
		}else {
			for(int i=0;i<size;i++) {
				System.out.println(i+"=Hello"+args[i]);
			}
		}
	}

}
