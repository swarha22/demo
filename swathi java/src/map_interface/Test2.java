package map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
			public static void main(String[] args) {
				
				//creating object for Map interface
				
				Map m = new HashMap();
				
				m.put(100, "swetha");
				m.put(101, "giri");
				m.put("subbu", 103);
				m.put(null, "sheela");
				//m.put(null, null);
				m.put(7.8, "raju");
				//m.put(100,"renu"); 
				
				System.out.println(m);
				
				System.out.println("Size is :" + m.size());
				System.out.println(m.containsKey( 80));//false
				System.out.println(m.containsValue("shekar"));//false
				System.out.println(m.get(1100)); //null
				System.out.println(m.remove(101)); //giri
				System.out.println(m.remove(1300));//null
				System.out.println(m.size());
				System.out.println(m.isEmpty());
				
				
				Set s = m.entrySet();
				System.out.println(s);
				for(Object o :s) {
					System.out.println(o);
				}
				
				
				
			}
}
