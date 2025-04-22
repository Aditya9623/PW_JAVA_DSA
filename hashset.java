
import java.util.*;
public class hashset
{
	public static void main(String[] args) {
	    HashSet hs=new HashSet();
	    
			hs.add(100);
			hs.add(10.5);
				hs.add("adi");
					hs.add(true);
						hs.add(100);
							hs.add(null);
		
		System.out.println(hs);
		
		hs.remove(10.5);
		System.out.println(hs);
		
		
							
	}
}