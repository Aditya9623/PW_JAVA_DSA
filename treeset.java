import java.util.*;
public class treeset
{
	public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add(100);
		ts.add(50);
			ts.add(150);
				ts.add(25);
					ts.add(75);
						ts.add(125);
							ts.add(175);
	System.out.print(ts);
		
	System.out.print(ts.higher(50));
	System.out.print(ts.higher(50));
	}
}
