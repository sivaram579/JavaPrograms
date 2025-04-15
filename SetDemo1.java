package Demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		 int[] array = {2,1,3,2,1,4,5,5,4,6,7,6};
	        
	        for(int i:array)
	        {
	            System.out.print(i+" ");
	        }
	        
	        Set<Integer> set = new HashSet<Integer>();
	        
	        for(int i:array)
	        {
	            set.add(i);
	        }
	        
	        System.out.println();
	        System.out.println("Set elements:");
	        
	        System.out.print(set);

	}

}
