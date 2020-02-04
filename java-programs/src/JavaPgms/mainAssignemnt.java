package JavaPgms;

import java.util.ArrayList;
import java.util.List;

public class mainAssignemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonocciseries fibObj=new Fibonocciseries();
		List<Integer> value = fibObj.fibmeth(21);
		System.out.println(value.toString());
			
		CharacterCount charCountObj=new CharacterCount();
		String[] xyz = { "a","b","a","c","b","c","b"};
		List<Integer> result1 = charCountObj.charCount(xyz);
		System.out.println(result1.toString());
		
		
		FizzBuzzPgm fizzBuzzObj=new FizzBuzzPgm();
		int[] Fizzbuzzvalues = {10,3,5,15};
		List<String> fzzBuzzReuslt = fizzBuzzObj.fizzBuzzMethod(Fizzbuzzvalues);
		
		DuplicateString duplicateObj=new DuplicateString();
		String[]  DuplicateValues= {"abc","mno","xyz","pqr","xyz","def","mno"};
		List<String> DuplicateResult=duplicateObj.DuplicateMethod(DuplicateValues);
		System.out.println(DuplicateResult.toString());
		
		PalindromePgm PalindromeObj=new PalindromePgm();
		List<String> PalindromeResult=PalindromeObj.PalindromeMethod(24);
		System.out.println(PalindromeResult.toString());
		
		CalculatorPgm addVal = new CalculatorPgm();
		int resultAdd = addVal.add(20,10);
		System.out.println("Calc prgm add output="+resultAdd);
		
		CalculatorPgm subVal = new CalculatorPgm();
		int resultsub = subVal.add(300,10);
		System.out.println("Calc prgm sub output="+resultsub);
		
		CalculatorPgm divVal = new CalculatorPgm();
		int resultdiv = divVal.add(400,10);
		System.out.println("Calc prgm div output="+resultdiv);
		
		
		

	}

}
