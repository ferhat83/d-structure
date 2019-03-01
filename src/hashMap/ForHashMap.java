package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ForHashMap 
{
		public static void main(String[] args) 
		{
			
			List<String>cityOfUSA = new ArrayList<String>();//declare arraylist 
			cityOfUSA.add("NY");
			cityOfUSA.add("CA");
			cityOfUSA.add("FL");
			
			List<String>cityOfUK = new ArrayList<String>();//declare arraylist
			cityOfUK.add("LONDON");
			cityOfUK.add("MANCHSTER");
			cityOfUK.add("LIVERPOOL");
			
			List<String>cityOfCanada = new ArrayList<String>();//declare arraylist
	
			//interfaceList<data type> list name = blue print of Array list class(java.util),      	
			cityOfCanada.add("montreal");
			cityOfCanada.add("toronto");
			cityOfCanada.add("vancouver");
			
			
			Map<String,List<String>> map = new HashMap<String , List<String>>();//declare map 
			 map.put("USA",cityOfUSA);
			 map.put("UK",cityOfUK);
	         map.put("Canada",cityOfCanada);
	            //key to set   ,  value    
	         
	         for(Entry<String,List<String>> country:map.entrySet())
	         {
	        	 System.out.println(country.getKey()+" "+country.getValue());
	         }	
	        	 //printing out using get key and get value.
	        	 
			Map<String,List<String>> map1 = new LinkedHashMap<String,List<String>>();//declare arraylist
			 map1.put("USA",cityOfUSA);
			 map1.put("UK",cityOfUK);
	         map1.put("Canada",cityOfCanada);
	         
	         for(Entry<String,List<String>> country1:map1.entrySet()) {
	        	 System.out.println(country1.getKey()+" "+country1.getValue());
	        	 //printing out using get key and get value;     
		}
	         
	            
	         

	}
		}

