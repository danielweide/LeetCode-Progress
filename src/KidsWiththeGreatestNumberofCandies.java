import java.util.*;

public class KidsWiththeGreatestNumberofCandies {

	public static void main(String[] args) {
		// 1431. Kids With the Greatest Number of Candies DanielWeide
		int[] candy = new int[] {2,3,5,1,3};
		System.out.println(kidsWithCandies(candy,3));
	}
	
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidList= new ArrayList<Boolean>();
        
        // obtain the highest number in the array
        int i; 
        
        // Initialize maximum element 
        int max = candies[0]; 
       
        // Traverse array elements from second and 
        // compare every element with current max   
        for (i = 1; i < candies.length; i++) 
            if (candies[i] > max) 
                max = candies[i]; 
        
        // determine if extra candies would make it higher than max
        for (i = 0; i < candies.length; i++) 
            if(candies[i]+extraCandies>=max)
            	kidList.add(true);
            else
            	kidList.add(false);
        
        return kidList;
    }

}
