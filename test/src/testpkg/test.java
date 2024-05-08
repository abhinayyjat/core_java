package testpkg;

public class test {
	public static void main(String[] args) {
		String whatever = "Nothing much happening here";
		System.out.println("String Length-"+whatever.length());
		System.out.println("7th character is-"+whatever.charAt(6));
		System.out.println("much index is-"+whatever.indexOf("much"));
	System.out.println("First i position-"+whatever.indexOf("i"));
		System.out.println("a is replaced by b-"+whatever.replace("a","b"));
		System.out.println("nothing"+whatever.toUpperCase());
        System.out.println("Starts with nothing-"+whatever.startsWith("nothing"));
		System.out.println("Substring-"+whatever.substring(6));
		
		StringBuffer myName = new StringBuffer("abhinay jat");
		System.out.println("Length: "+myName.length());
		System.out.println("Capacity: "+myName.capacity());
		System.out.println("Char at:" +myName.charAt(1));
		System.out.println("Reverse:"+myName.reverse());
		System.out.println(myName);
		System.out.println("replace"+myName.replace(0, 2,"sharma"));
	    System.out.println(myName);
	    
	   
	}

}
