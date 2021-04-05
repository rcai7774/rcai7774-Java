import challenges.*;
import leetcode.*;
import dupe.*;
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
		for(int i = 1; i < 1001; i++){
			System.out.println("" + i + ": " + DivisibleByTwo.divisi(i));
		}
		for(int i = 1; i < 1025; i++){
			System.out.println("" + i + ": " + BinaryPower.binaryPower(i));
		}
		Codec c = new Codec();
        System.out.println(c.encode("https://leetcode.com/problems/design-tinyurl"));
        int[] nums = {1,2,3,4,5,6,7,8,9,10,1};
        System.out.println(Duplicates.containsDupes(nums));
  }
}