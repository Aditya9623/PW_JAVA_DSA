import java.util.*;
public class Map1
{
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1,"Aditya");   //Entry
		map.put(2,"Ayu");
		map.put(3,"ved");
		map.put(4,"rorko");
		
		System.out.println(map);
		
		System.out.println(map.get(4));
		
		Set keySet = map.keySet();   //return keys
		Iterator itr1=keySet.iterator();
		while(itr1.hasNext()){
		  //  System.out.println(itr1.next());
		   Integer key=(Integer)itr1.next();
		   System.out.println(key);
		}
		
		Collection values=map.values();  //return values
		Iterator itr2=values.iterator();
		while(itr2.hasNext()){
		    System.out.println(itr2.next());
		}
		
		Set entrySet=map.entrySet();  //return both
		Iterator itr3=entrySet.iterator();
		while(itr3.hasNext()){
		  //  System.out.println(itr3.next());
		  
		  Map.Entry data =(Map.Entry)itr3.next();
		  System.out.println(data.getKey() + " : "+ data.getValue());
		}
	}
}
