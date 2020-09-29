
public class RunningSumof1dArray {

	public static void main(String[] args) {
		//1480. Running Sum of 1d Array DanielWeide Cleared
		
	}
	
    public int[] runningSum(int[] nums) {
    	
        int[] runSum= new int[nums.length];
        
        for(int i=0;i<nums.length;i++) 
        {
        	// first time only
        	if(i==0) {
        	runSum[i]=runSum[i]+nums[i];
        	}else {
        	runSum[i]=runSum[i-1]+nums[i];
        	}
        }
        
        return runSum;
    }
}
