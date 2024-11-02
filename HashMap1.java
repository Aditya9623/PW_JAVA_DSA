import java.util.*;
public class HashMap1
{
	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put(01,"Virat");
		hm1.put(02,"Rohit");
		hm1.put(03,"Aditya");
		 
		System.out.print(hm1);
		
		HashMap hm2 = new HashMap();
		hm2.put("ved","Virat");
		hm2.put("adi","Rohit");
		hm2.put("ayu","Aditya");
		 
		System.out.print(hm2);
		
		LinkedHashMap hm3 = new LinkedHashMap();
		hm3.put("ved","Virat");
		hm3.put("adi","Rohit");
		hm3.put("ayu","Aditya");
		 
		System.out.print(hm2);
	}
}
