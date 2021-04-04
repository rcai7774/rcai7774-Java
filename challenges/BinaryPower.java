class BinaryPower{
	static boolean binaryPower(int N){
		String bla = Integer.toBinaryString(N);
		return bla.lastIndexOf('1') == bla.indexOf('1'); 
	}
}