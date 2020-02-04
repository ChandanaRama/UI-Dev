package JavaPgms;

import java.util.ArrayList;
import java.util.List;

public class DuplicateString {

	public static List<String> DuplicateMethod(String[] info) {
		
		List<String> mylist = new ArrayList<String>();
		for(int i = 0;i<info.length;i++){
			{ 	//System.out.println("i");
				//System.out.println(info[i]);
			
			
				for(int j = i+1;j<info.length;j++){
					//System.out.println("j");
					//System.out.println(info[j]);
				
					if(info[i]==info[j]){
						
						mylist.add(info[j]);
					}
					
				}
				
				
			}
			
			
		}
		return mylist;
		

	}

}
