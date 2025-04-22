import java.util.*;
public class arraylist
{
	public static void main(String[] args) {
//		ArrayList <Integer>al = new ArrayList<Integer>();    //Homogenous elements
		ArrayList al = new ArrayList();   //Heteregenous elements
		
		al.add(100);
			al.add(10.5);
				al.add("adi");
					al.add(true);
						al.add(100);
							al.add(null);
		
		
		System.out.println(al.size());
		System.out.println(al);
		
		al.set(1,20);
			System.out.println(al);
			
// 			for(int i=0;i<al.size();i++){
// 			   System.out.println(al.get(i)); 
// 			}
			
// 			for(Object i : al){
// 			    System.out.println(i);
// 			}
			
			Iterator it = al.iterator();
			
			while(it.hasNext()){
			    System.out.println(it.next());
			}
		    
		    System.out.println(al.isEmpty());
		    
		    //remove all the elements from array ArrayList
		    ArrayList al1=new ArrayList();
		    al1.add("adi");
		    al1.add(true);
		    al1.add(null);
		    
		    al.removeAll(al1);
		    System.out.println(al);
		    
		    al.clear();
		    System.out.println(al.isEmpty());
	}
}