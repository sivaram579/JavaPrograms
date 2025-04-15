package Demo;

public class StringReplaceAll 
{
	public static void main(String[] args) 
	{
		//Program to reove upper case letters from String using ReplaceAll method
		String s1 = "Sivaram Somanchi";
		String s2 = s1.replaceAll("[A-Z]", "");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String[] s3 = s2.split(" ");
		
		StringBuilder ReqStr = new StringBuilder();
		
		for(String s:s3)
		{
			StringBuilder req1 = new StringBuilder(s);
			ReqStr.append(req1.reverse()+" ").toString();
		}
		
		System.out.println(ReqStr);
	}
}