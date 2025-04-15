package Demo;

public class ReverseWords 
{
	public static void main(String[] args)
	{
		String s1 = "Sivaram Somanchi";
		String s2 = s1.replaceAll("[A-Z]", "");
		
		String[] words = s2.split(" ");	
		StringBuilder result = new StringBuilder();		
		
		for(String word:words)
		{
			StringBuilder reverseword = new StringBuilder(word);
			result = result.append(" "+reverseword.reverse().toString().trim());
		}
		
		System.out.println("Original : "+s1);
		System.out.println("Required: "+result);
	}
}
