import java.util.*;
import java.util.Map;
public class HashMap2
{
	public static void main(String[] args) {
		HashMap <Integer, String>hm1 = new HashMap<Integer, String>();
		hm1.put(01,"Virat");
		hm1.put(02,"Rohit");
		hm1.put(03,"Aditya");
		hm1.put(04,"Saloni");
		hm1.put(05,"Guddu");
		 
		System.out.println(hm1);
		System.out.println("Size of hm1 = "+hm1.size());
		hm1.remove(03);
		System.out.println(hm1);
		
		System.out.println(hm1.get(02));
		
		//get all the keys from hashmap
		System.out.println(hm1.keySet());
		System.out.println(hm1.values());
		System.out.println(hm1.entrySet());
		
		//using for each loop
// 		for(int i: hm1.keySet()){
// 		    System.out.println(i+ "    "+hm1.get(i));
// 		}
		
		//using Iterator
		Iterator<Entry<Integer, String>> it = hm1.entrySet().iterator();
		while(it.hasNext()){
		  Entry<Integer, String> entry = it.next();
		  System.out.println(entry.getKey()+ "     "+entry.getValue());
		}
		
		HashMap hm2 = new HashMap();
		hm2.put("ved","Virat");
		hm2.put("adi","Rohit");
		hm2.put("ayu","Aditya");
		 
		System.out.println(hm2);
		
		LinkedHashMap hm3 = new LinkedHashMap();
		hm3.put("ved","Virat");
		hm3.put("adi","Rohit");
		hm3.put("ayu","Aditya");
		 
		System.out.println(hm2);
	}
}