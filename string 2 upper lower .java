package basic;

public class SubString {

	public static void main(String[] args) {
		String s = "Helloooooooooo";
		System.out.println(s.substring(0,5));
		System.out.println(s.substring(0));
		
		String y = "I hate dogs";
		System.out.println(y.replace("dogs", "cats"));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String a = ("Hello World");
				if(a.startsWith("H")&&a.endsWith("d"))
				{
					System.out.println("True");
				}
	}

}