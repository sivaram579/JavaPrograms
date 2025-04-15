package Demo;

public class StringDemo1 
{
	public static void main(String[] args) 
	{
		String s1 = "Srihaan Rishi Somanchi";
		String s2 = "";
		String input1 = "Srihaan.Rishi.Somanchi.04102019";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2 = s2+s1.charAt(i);
		}
		
		System.out.println("Original: "+s1);
		System.out.println("Required : "+s2);
		
		String s3 = s2.replaceAll("[A-Z]", "");
		System.out.println("Remove Uppercase : "+s3);
		
		String s4=s1.toLowerCase();
		System.out.println("Change to lowercase: "+s4);
		
		String s5=s1.toUpperCase();
		System.out.println("Change to uppercase: "+s5);
		
		String[] s6 = input1.split("\\.");
		System.out.println("required output: "+s6[s6.length-1]);
		
		
	}

}
