package JavaPgms;

public class ExceptionalHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int a=5, b=0, c;
		c=a/b;
		System.out.println(c);
	}

		catch(Exception x){
			System.out.println("divided by zero"+x);
		}
			
		}
}
