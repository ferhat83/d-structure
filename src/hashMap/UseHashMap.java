package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UseHashMap {

	public static void main(String[] args) {
		// declare an object using Map and HashMap and import them. 
		Map<String,String> map = new HashMap<String,String>();
		 map.put("USA","New york");
		 map.put("UK","London");
         map.put("Canada"," Montreal");
         
         System.out.println(map.get("USA"));
         System.out.println(map.get("Canada"));
         
         for(Entry<String, String> country: map.entrySet()) {
        	 System.out.println(country.getKey()+" "+ country.getValue());
         }
         
	}

}
