//171rdb337      %2    = uzd 1.
//  Recursive Digit Sum

package superdigit;

public class SuperDigit {
	
	public static int superDigit(int n){
		String num = new Integer(n).toString();
		int numSum = num.chars().map(Character::getNumericValue).sum();
		int numCount = num.length();
		if (numCount == 1) 
			return numSum;
		else
			return superDigit(numSum);
	}	

}
