
public class ValidParenthesisString {

	public static void main(String[] args) {
		// 678. Valid Parenthesis String DanielWeide
		
		//testing vector
		System.out.println(checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));

	}
	
	public static boolean checkValidString(String s) {
		if(s.equals("")) {
			return true;
		}else {
		
		// break the string first
		char[] cArray = s.toCharArray();
		// count number of each character
		int[] cCounter = new int[3]; // 0 -> ( , 1-> ) , 2 -> *
		for(int i=0;i<(cArray.length);i++) 
		{
			if(cArray[i]=='(') {
				cCounter[0] = cCounter[0]+1;
			}else if(cArray[i]==')') {
				cCounter[1] = cCounter[1]+1;
			}else {
				cCounter[2] = cCounter[2]+1;
			}
		}
		// diff counter
		int difCounter;
		// first check
		if(cCounter[0] != cCounter[1]) 
		{
			// immediate fail
			if(cArray[0]==')') 
			{
				return false;
			}
			
			// comparing the ( and ) to see if * can balance it
			if(cCounter[0]> cCounter[1]) 
			{
				// if ( is more than ) 
				difCounter = cCounter[0]-cCounter[1];
				
				if(difCounter<=cCounter[2]) 
				{
				// good no issue
					return true;
				}else {
					//fail
					return false;
				}
			}else 
			{
				// if ) is more than ( 
				difCounter = cCounter[1]-cCounter[0];
				
				if(difCounter<=cCounter[2]) 
				{
				// good no issue
					return true;
				}else {
					//fail
					return false;
				}
			}
			
		}else 
		{
			// immediate fail
			if(cArray[0]==')') 
			{
				return false;
			}
			// nothing wrong
			return true;
		}
		
	}
	}

}
