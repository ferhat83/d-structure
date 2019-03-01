package arrayList;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();//declare arraylist.
		//array list let us add object. the array is open to add objects
	
		
		list1.add(11);//add  objects
		list1.add(20);//add objects
		list1.add(25);//add objects
		list1.add(295);//add objects
		
		for(Integer data:list1) {
			System.out.println(data);
		}

	}

}
