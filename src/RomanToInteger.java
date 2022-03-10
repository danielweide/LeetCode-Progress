import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("MCMXCIV"));
	}

	/*
	 * https://leetcode.com/problems/roman-to-integer/
	 * 13. Roman to Integer
	 * Symbol       Value
		I             1
		V             5
		X             10
		L             50
		C             100
		D             500
		M             1000
		IV			  4
		IX			  9
		XL			  40
		XC			  90
		CD			  400
		CM			  900
		
		
    	I can be placed before V (5) and X (10) to make 4 and 9. 
    	X can be placed before L (50) and C (100) to make 40 and 90. 
    	C can be placed before D (500) and M (1000) to make 400 and 900.

	 */
	    public static int romanToInt(String s) {
	    	// Link the values to each characters
	    	HashMap<String, Integer> romanValues = new HashMap<String, Integer>();
	    	romanValues.put("I", 1);
	    	romanValues.put("V", 5);
	    	romanValues.put("X", 10);
	    	romanValues.put("L", 50);
	    	romanValues.put("C", 100);
	    	romanValues.put("D", 500);
	    	romanValues.put("M", 1000);
	    	romanValues.put("IV", 4);
	    	romanValues.put("IX", 9);
	    	romanValues.put("XL", 40);
	    	romanValues.put("XC", 90);
	    	romanValues.put("CD", 400);
	    	romanValues.put("CM", 900);
	    	
	    	int romanIntVal = 0;
	    	// read the string line by line
	    	for (int i=0; i < s.length(  ); i++) {
	    		
	    		if(s.charAt(i)=='I' && i!=(s.length()-1)) {
	    			// check if the next character meets the special case
	    				if(s.charAt(i+1)=='V') {
	    					i++; // skipping because it is 4
	    					romanIntVal += romanValues.get("IV");
	    				}else if(s.charAt(i+1)=='X') {
	    					i++; // skipping because it is 9
	    					romanIntVal += romanValues.get("IX");
	    				}else {
	    					romanIntVal += romanValues.get("I");
	    				}
	    		}else if(s.charAt(i)=='X' && i!=(s.length()-1)) {
    					if(s.charAt(i+1)=='L') {
    						i++; // skipping because it is 40
    						romanIntVal += romanValues.get("XL");
    					}else if(s.charAt(i+1)=='C') {
    						i++; // skipping because it is 90
    						romanIntVal += romanValues.get("XC");
    					}else {
    						romanIntVal += romanValues.get("X");
    				}
	    		}else if(s.charAt(i)=='C' && i!=(s.length()-1)) {
						if(s.charAt(i+1)=='D') {
							i++; // skipping because it is 400
							romanIntVal += romanValues.get("CD");
						}else if(s.charAt(i+1)=='M') {
							i++; // skipping because it is 900
							romanIntVal += romanValues.get("CM");
						}else {
							romanIntVal += romanValues.get("C");
				}
	    		}else {
	    			romanIntVal += romanValues.get(Character.toString(s.charAt(i)));
	    		}
	    		//look out for special cases as it loops
	    	}
	        return romanIntVal;
	    }
	

}
