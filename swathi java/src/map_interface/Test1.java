package map_interface;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
		public static void main(String[] args) {
			
			//creating an object for Map Interface
			
			Map m = new HashMap();
			m.put(100, "Swathi");
			m.put(200, "Sarika" );
			m.put(300, "Sagarika");
			m.put(400, "Kavya");
			m.put("siri", 500);
			m.put(200, "shannu");
			//m.put(200, "deepu");
			m.put(100, "swetha");
			m.put(700, "swathi");
			m.put(null, null);
			//m.put(null, 2.3f);
			
			System.out.println(m);
			
			
		}
}
