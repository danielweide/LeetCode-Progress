
public class ReorderedPower2 {

	public static void main(String[] args) {
		// Reordered Power of 2, March 21 2021 // Incomplete because need to have rearrangement
		reorderedPowerOf2(17);
	}
	
	public static boolean reorderedPowerOf2(int N) {
		// Square root method
		int theSquareValue = (int)Math.floor((Math.sqrt(N)));
		int powerNumberTest = (int)Math.pow(2, theSquareValue); // Check if it is the same as given N
        if(powerNumberTest == N) {
        	return true;
        }else if(N==1){
        	return true;
        }else {
        	return false;
        }
    }

}
