import java.util.*;

class StringExample{
    public static void main(String[] args){
	    String name = "Hitanshu";
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(5));
		System.out.println(name.substring(3));
		System.out.println(name.substring(0,5));
		System.out.println(name.contains("anshu"));
		System.out.println(name.equals("anshu"));
	}
}