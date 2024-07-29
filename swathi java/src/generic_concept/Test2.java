package generic_concept;

import java.util.ArrayList;

public class Test2 {
			
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		
		for(int i=1; i<=20; i++) 
		{
			al.add(i);
		}
		
		//al.add("Shanthi");
		
		for(Integer o : al) 
		{
			if(o%2!=0) {
				System.out.println(o);
			}
		}
	}
}
