
public class CaeserCypher {
	
	private int key; //Key instance variable
	
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //current alphabet
	
	private static String shiftedAlphabet; //shifted alphabet
	
	public CaeserCypher(int userKey) {
		
		this.key = userKey;
		String leftSubstring = alphabet.substring(0,key);
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring + leftSubstring;
		
	}
	

}
