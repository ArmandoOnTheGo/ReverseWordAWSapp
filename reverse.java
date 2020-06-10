package reverseEntry;

public class reverse {

	public static void main(String[] args) {
		String test = "Hello World";
		System.out.println(reverseEntry(test));
	}

	private static String reverseEntry(String entry) {
		if(entry.isEmpty()) return "";
		
		int len = entry.length();
		char[] rev = new char[len];
		int i = 0, j = len-1;
		while(i <= len/2) {
				rev[i] = entry.charAt(j);
				rev[j] = entry.charAt(i);
				i++;
				j--;
		}
		return new String(rev);
	}
}
