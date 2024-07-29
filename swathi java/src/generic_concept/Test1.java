package generic_concept;

import java.util.ArrayList;  //without generics

public class Test1 {
		public static void main(String[] args) {
			
			ArrayList<Integer> al = new ArrayList();
			
			for(int i=1; i<=20; i++) {
				al.add(i);
			}
			
			//al.add("swathi");
			
			
			for(Object o : al)
			{
				if((Integer)o%2==0) {
					System.out.println(o);
				}
			}
		}
}
