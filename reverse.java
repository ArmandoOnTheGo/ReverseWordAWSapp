public String reverseEntry(String entry) {
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
	System.out.println(new String(rev));
}
