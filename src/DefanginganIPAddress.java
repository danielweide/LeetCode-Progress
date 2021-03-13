
public class DefanginganIPAddress {

	public static void main(String[] args) {
		// 1108. Defanging an IP Address
		String ipAddress = "10.10.256.0"; 
		int[] ipArray = new int[4];
		String defangIpAddress = "";
		
		for(int i=0;i<4;i++) { // default format for ip address
		ipArray[i] = Integer.parseInt(ipAddress.split("\\.")[i]);
		if(i<3) {
		defangIpAddress += ipArray[i] + "[.]";
		}else {
			defangIpAddress += ipArray[i];
		}
		// the check to be done here , if it is larger than 255 or then something is wrong
		/*if(ipArray[i]>255) 
		{
		System.out.println("break");
		break;
		}*/
		}
		System.out.println(defangIpAddress);
		

	}

}
