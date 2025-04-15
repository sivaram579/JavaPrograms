package Demo;

public class RegularExpressionsDemo1 
{
	public static void main(String[] args) 
	{
		String s1 = "Sivaram.Somanchi.1.io";
		
		String[] s2 = s1.split("\\.");
		
		int size = s2.length;
		
		System.out.println(s2[0]);
		
		System.out.println(size);
		
		if(size>3)
			System.out.println("Required value: "+s2[size-1]);	

	}

}
