package one_two;

public class Permutation {
	
	public static boolean checkPerm(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		int[] arr = new int[128];
		
		for(int i = 0; i < a.length(); i++){
			arr[a.charAt(i)]++;
		}
		
		for(int i = 0; i < b.length(); i++) {
			arr[b.charAt(i)]--;
			if(arr[b.charAt(i)] < 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "god";
		String b = "dog";
		System.out.println(checkPerm(a, b));

	}

}
