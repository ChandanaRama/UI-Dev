package JavaPgms;

import java.util.ArrayList;
import java.util.List;

public class PalindromePgm {

	public static List<String> PalindromeMethod(int n) {
		List<String> mylist=new ArrayList<String>();
		int sum=0, temp, r;
		temp = n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
					n=n/10;
					
			}
		if(temp==sum){
mylist.add("This number is palindrome");
		}
		else{
			mylist.add("This number is not a palindrome");
			
		}
		return mylist;
	}

}
