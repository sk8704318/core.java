package StringClass;

public class StringLength {
	public static void main(String[] args) {
		String name="rays technologies";
		System.out.println("String Length  :-" +name.length());
		System.out.println("String Length  :-" +name.charAt(5));
		System.out.println("String Length  :-" +name.indexOf("l"));
		System.out.println("String Length  :-" +name.indexOf("g"));
		System.out.println("String Length  :-" +name.lastIndexOf("s"));
		System.out.println("String Length  :-" +name.replace("r","R"));
		System.out.println("String Length  :-" +name.toLowerCase());
		System.out.println("String Length  :-" +name.toUpperCase());
		System.out.println("String Length  :-" +name.startsWith("rays"));
		System.out.println("String Length  :-" +name.endsWith("technologies"));
		System.out.println("String Length  :-" +name.substring(6));
	}
	
	
	
}
