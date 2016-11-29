import java.util.*;

public class Eingabe {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		Gross g=new Gross();
		System.out.println("Geben Sie etwas ein: ");
		s=sc.nextLine();
		System.out.println(g.upperCase(s));
	}
}