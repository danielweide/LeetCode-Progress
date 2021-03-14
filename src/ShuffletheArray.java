import java.util.LinkedList;
import java.util.Queue;

public class ShuffletheArray {

	public static void main(String[] args) {
		// 1470. Shuffle the Array
		
		
		int[] theNums = {1,2,3,4,5,1,2,3,4,5};
		int n = 5;
		int[] theNumsCheck = new int[10];
		theNumsCheck = shuffle(theNums,n);
		for(int i=0;i<10;i++) {
			System.out.println(theNumsCheck[i]);
		}
	}
	
	public static int[] shuffle(int[] nums, int n) {
		// To Cut it into half
		int[] theShuffledNums = new int[2*n];
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0;i<n;i++) 
		{
			//extract the item and throw into a queue
			queue.add(nums[i]);
			queue.add(nums[n+i]);
		}
		
		for(int i=0;i<(2*n);i++) {
			theShuffledNums[i] = queue.poll();
		}
        return theShuffledNums;
    }

}
