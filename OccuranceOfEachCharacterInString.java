package Demo;

import java.util.HashMap;

public class OccuranceOfEachCharacterInString {

	public static void main(String[] args) 
	{
		String s="hello world";
		   
	   char[] charArray = s.toCharArray();
	   
	   HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	   
	   for(char c:charArray)
	   {
	       if(c!=' ')
	       {
	            hm.put(c,hm.getOrDefault(c,0)+1);
	       }	      
	   }
	   
	   for(char c:hm.keySet())
	   {
	       System.out.println(c+" - "+hm.get(c));
	   }
	}
}