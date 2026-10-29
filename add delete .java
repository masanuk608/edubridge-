import java.util.ArrayList;
public class edu {

	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("john");
		names.add("maria");
		names.add("dennis");
		names.remove(1);
		names.remove("dennis");
		System.out.println(names);


	}

}