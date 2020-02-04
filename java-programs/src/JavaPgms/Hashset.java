package JavaPgms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set val = new HashSet();
		val.add("hello");
		val.add(10);
		val.add(200);
		System.out.println(val.size());
		Iterator i = val.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		
	}

}
