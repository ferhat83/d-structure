package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterator {

	public static void main(String[] args) {
	List<Integer> tab = new ArrayList<Integer>();
	
	  tab.add(11);
	  tab.add(30);
	  tab.add(20);
	  tab.add(234);
	  
	  Iterator it = tab.listIterator();//use Iterator it to display elements saved  in the arraylist.
	  while(it.hasNext()) {//use while to go to the next line.
		  System.out.println(it.next());
	  }
	
	   }
	}