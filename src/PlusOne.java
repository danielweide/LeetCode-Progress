import java.util.*;

public class PlusOne {

	public static void main(String[] args) {
		// 66. Plus One
		int[] testArr = {9,9,9,8};
		//[9,8,7,6,5,4,3,2,1,0]
		plusOne(testArr);
	}
	
	 public static int[] plusOne(int[] digits) {
		 // special case of full 999 will become 1000 where it changes in the length
		 // normal cases we can just watch out for 9
		 // 1199 -> 1200 where we change 0 

		 // we just make sure the last item is not 9
		 
		 // new method
		 int newdigits[] = new int[digits.length+1];
		 
		 // items with size 1
		 if(digits[0]==9&&digits.length==1) {
			 digits[0]=10;
			 newdigits[0]=1;
			 newdigits[1]=0;
			 return newdigits;
		 }else if(digits[0]<9 && digits.length==1) {
			 digits[0]=digits[0]+1;
			 return digits;
		 }
		 // items with size larger than 1 which may result with 10 within the chain
		boolean overFlow = false;
		digits[digits.length-1] = digits[digits.length-1]+1;
		
		// if last array is 10 we will loop until it becomes not 10 from behind
		
		for(int i=digits.length-1;i>0;i--) {
			if(digits[i]==10) {
				digits[i]-=10;
				digits[i-1]=digits[i-1]+1;
			}
		}
		
		if(digits[0]==10) {
			for(int j=newdigits.length-1;j>0;j--) {
				if(j==1) {
					newdigits[j]=0;
					newdigits[j-1]=1;
				}else {
					newdigits[j] = digits[j-1];
				}
			}
			overFlow=true;
		}
		
		if(overFlow)
			return newdigits;
		//System.out.println(Arrays.toString(newdigits));
		else
			return digits;
		//System.out.println(Arrays.toString(digits));

		 // missing out conditions
		 /*
		 boolean overFlow = false;
		 int newdigits[] = new int[digits.length+1];
		 for(int i=digits.length-1;i>0;i--) {
			 if(digits[i]==9) {
				 digits[i]=0;
				 digits[i-1]=digits[i-1]+1;
			 }else if(digits[i]==10) {
				digits[i] =0;
				digits[i-1]=digits[i-1]+1;
			 } else {
				 digits[i] = digits[i]+1;
				 break;
			 }
		 }
		 if(digits[0]==9&&digits.length==1) {
			 digits[0]=10;
		 }else if(digits[0]<9 && digits.length==1) {
			 digits[0]=digits[0]+1;
		 }
		 if(digits[0]==10) 
		 {
			 for(int i=0;i<newdigits.length;i++) {
				 if(i==0)
					 newdigits[i]=1;
				 else
				 newdigits[i] = 0;
			 }
			 overFlow = true;
		 }
		 
		 if(overFlow) {
			 return newdigits;
		 }else {
			 return digits;
		 }*/
		 //System.out.println(digits);
		// return null;
		 // reverse adding and multiply by 10 and addition after the first number
		 // Impossible as the length can hit 100 of lenght
		 
		 /*
		 String intStrVersion ="";
		 int intIntVersion =0;
		 for(int i=0; i< digits.length;i++) {
			 intStrVersion = intStrVersion + digits[i];
		 }
		 intIntVersion = Integer.parseInt(intStrVersion) + 1;
		 intStrVersion = String.valueOf(intIntVersion);
		 
		 int[] newDigits = new int[intStrVersion.length()];
		 
		 int counter = newDigits.length-1;
	        while(intIntVersion > 0){
	        	newDigits[counter]= intIntVersion % 10;
	        	intIntVersion = intIntVersion / 10;
	        	counter--;
	        }
		 
	        return newDigits;
	        */
		 // fails when number hits 10 character
	    }

}
