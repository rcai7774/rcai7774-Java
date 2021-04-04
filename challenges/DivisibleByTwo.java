class DivisibleByTwo{
	static boolean divisi(int N){
		String s = Integer.toBinaryString(N);
		return s.charAt(s.length() - 1) == '0';
	}
}