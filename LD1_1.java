package imperative;

import java.util.Set;
import java.util.HashSet;


public class LD1_1 {

	public enum STATE {
		ABUNDANT,
		DEFICIENT,
		PERFECT
	};
	
	public static STATE process(int n) {
		Integer  number = divisors(n).stream().mapToInt(Integer::intValue).filter((num) -> num != n).sum();
		STATE result = null;
		
		if (number == n){
			result = STATE.PERFECT;
		}
		if (number < n){
			result = STATE.DEFICIENT;
		}
		if (number > n){
			result = STATE.ABUNDANT;
		}
	
		return result;
	}
	
	public static Set<Integer> divisors(int n){
		Set<Integer> sDivisors =  new HashSet<Integer>();
		for (int i=1;i<=n;i++) 
			if (n%i==0)
				sDivisors.add(i);
		
		return sDivisors;
	}
}