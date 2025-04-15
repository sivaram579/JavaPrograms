package Demo;

public class StringReverseDemo 
{
	public static void main(String[] args)
	{
		String s1 = "Sivaram Somanchi";
		String s2 = s1.replaceAll("[A-Z]","");
		StringBuilder result = new StringBuilder();
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		StringBuilder reverse = new StringBuilder(s2);
		result = reverse.reverse();		
		
		System.out.println(result);
	}

}
