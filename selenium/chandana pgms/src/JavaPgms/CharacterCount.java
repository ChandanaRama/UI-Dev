package JavaPgms;

import java.util.ArrayList;
import java.util.List;

public class CharacterCount {

		public static List<Integer> charCount(String[] val){
		
		String temp[] = val;
		int j = 1;
		int acount = 0;
		int bcount = 0;
		int ccount = 0;
		int dcount = 0;
		for(int i = 0;i<val.length;i++){
			System.out.println("i");
			System.out.println(i);
			
			for(int k = i;k<val.length;k++){
				System.out.println("k");
				System.out.println(k);
				if(val[i] == temp[k]){
					System.out.println(val[i]);
					System.out.println(temp[k]);
					if(temp[k] == "a"){
						acount = acount + 1;
						System.out.println("acount");
						System.out.println(acount);
						
					}
					else if(temp[k] == "b"){
						bcount = bcount + 1;
					}
					else if(temp[k] == "c"){
						ccount = ccount + 1;
					}
					else if(temp[k] == "d"){
						dcount = dcount + 1;
					}
					
				}
				
				
			}
			
			
		}
		System.out.println(acount);
		System.out.println(bcount);
		System.out.println(ccount);
		System.out.println(dcount);
		List<Integer> resultCount=new ArrayList<Integer>();
		resultCount.add(acount);
		resultCount.add(bcount);
		resultCount.add(ccount);
		resultCount.add(dcount);
		return(resultCount);
		
		}

}
