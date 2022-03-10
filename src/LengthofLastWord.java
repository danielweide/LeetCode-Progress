
public class LengthofLastWord {

	public static void main(String[] args) {
		// 58. Length of Last Word
		
		String s1="java string split method by javatpoint     Camp  ";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array
		int j = words[words.length-1].length();
		System.out.print(j);
		//int i = j.length();

	}

}
