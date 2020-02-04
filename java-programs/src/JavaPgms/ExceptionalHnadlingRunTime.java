package JavaPgms;

public class ExceptionalHnadlingRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int a[]=new int[5];
		a[1]=10;
		a[100]=200;
	}
		catch(Exception x){
			System.out.println(x);
		}
			
		}

}
