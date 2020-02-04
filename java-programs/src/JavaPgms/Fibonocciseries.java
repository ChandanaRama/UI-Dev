package JavaPgms;

import java.util.ArrayList;
import java.util.List;

public class Fibonocciseries {

	public List<Integer> fibmeth(int num){
		System.out.println(num);
			int c=0;
			int i=0;
			int j=0;
			int result=1;
			int first = 0, second = 1;
	
			List<Integer> myList = new ArrayList<Integer>();
			//System.out.println("first"+""+first);
			//System.out.println("second"+""+second);
			for (int k=0; result<num ; k++){
				if(k==0){
					//System.out.println(i);
					myList.add(i);
				}else{
					result = i + result;
					i = j;
					j = result;
					//System.out.println(result);
					myList.add(result);
				}
			}
			
			return myList;
		}
	


}
