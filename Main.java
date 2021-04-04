class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
	//	Base b = new Derived(); 
       // b.fun(); 
		//Base2 c = new Derived2();
		//c.fun();
		//Child a = new Child();
		//a.show();
		//Parent p = new Parent();
		//p.m1();
		//p.m2();
		DivisibleByTwo t = new DivisibleByTwo();
		for(int i = 1; i < 1001; i++){
			System.out.println("" + i + ": " + t.divisi(i));
		}
		BinaryPower p = new BinaryPower();
		for(int i = 1; i < 1025; i++){
			System.out.println("" + i + ": " + p.binaryPower(i));
		}
  }
}