package JavaPgms;

public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal= "macdam";
		char[] ch = pal.toCharArray(); 
		int j=0;
		boolean status = true;
		for(int i = ch.length-1; i>=0 ;i--){
			if(ch[j] != ch[i]){
				status = false;
				break;
			}
			j++;
		}
		if(status){
			System.out.println("PALINDROME");
		}
		else{
			System.out.println("NOT A PALINDROME");
		}
	}

	
	

}
