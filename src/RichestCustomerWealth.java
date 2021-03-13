import java.util.stream.IntStream;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		// 1672. Richest Customer Wealth
		int[][] accounts = new int[6][4];
		accounts[0][0]= 1;
		accounts[0][1]= 3;
		accounts[0][2]= 3;
		accounts[0][3]= 5;
		
		accounts[1][0]= 1;
		accounts[1][1]= 31;
		accounts[1][2]= 13;
		accounts[1][3]= 5;
		
		accounts[2][0]= 1;
		accounts[2][1]= 33;
		accounts[2][2]= 34;
		accounts[2][3]= 56;
		
		accounts[3][0]= 1;
		accounts[3][1]= 37;
		accounts[3][2]= 39;
		accounts[3][3]= 95;
		
		accounts[4][0]= 1;
		accounts[4][1]= 39;
		accounts[4][2]= 93;
		accounts[4][3]= 95;
		
		accounts[5][0]= 19;
		accounts[5][1]= 36;
		accounts[5][2]= 32;
		accounts[5][3]= 5;
		/*int[] arr = {1, 2, 3, 4, 5};
		int[] arra = {1, 2, 3, 4, 5};
		int[] arrb = {1, 2, 3, 4, 5};
		int[] arrc = {1, 2, 3, 4, 15};
		int[] arrd = {1, 2, 3, 4, 5};
		int[] arre = {1, 2, 3, 4, 5};*/
	    int wealthyman =0;
	    int temporaryCheck =0;
	    // To determine the Richest Wealth
	    for(int i= 0;i<accounts.length;i++) {
	    	temporaryCheck = IntStream.of(accounts[i]).sum();
	    	
	    	if(temporaryCheck > wealthyman) 
	    	{
	    	wealthyman = temporaryCheck;	
	    	}
	    }
	    System.out.println(wealthyman);
	}

}
