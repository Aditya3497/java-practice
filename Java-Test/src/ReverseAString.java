
public class ReverseAString {

	public static void main(String[] args) {
		String name = "Aditya";
		int lang = name.length();
		String rev = "";
		
		for (int i=lang-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("The name is " + name );
		System.out.print("Reverse of name is" + rev);
	}

}
