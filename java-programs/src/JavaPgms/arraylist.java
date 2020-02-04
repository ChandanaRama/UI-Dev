package JavaPgms;

import java.util.List;
import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>val = new ArrayList<>();
		val.add("manual");
		val.add("QTP");
		val.add("testing");
		System.out.println(val.size());
	for(int i=0;i<=val.size();i++)
	{
		System.out.println(val.get(i));
	}

	}

}
