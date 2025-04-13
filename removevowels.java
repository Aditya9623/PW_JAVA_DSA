
public class removevowels
{
    public static String vowel(String s){
        // if(s==null || s.isEmpty())
        // return s;
        
        return s.replaceAll("[aeiouAEIOU]","");
    }
	public static void main(String[] args) {
	    
	    String s = "saloni";
			System.out.println(vowel(s));
	}
}
