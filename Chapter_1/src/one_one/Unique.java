package one_one;

public class Unique {
	
	static boolean isUnique(String word){
		
		if(word.length() > 128) {
			return false;
		}
		boolean[] charSet = new boolean[128];
		for (int i = 0; i < word.length(); i++) {
			int val = word.charAt(i);
			if(charSet[val]) {
				return false;
			}
			charSet[val] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "helo";
		System.out.println(isUnique(word));

	}
	
	

}
