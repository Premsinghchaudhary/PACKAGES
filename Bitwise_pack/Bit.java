package BITWISE_PACK;
import ARTHEMTIC_PACK.arthmetic;
public class Bit extends arthmetic  {
	
public void bitwise_opr() {
	System.out.println("THIS IS FOR BITWISE OPERATION");
   aceept();
    System.out.println("a&b = " + (a & b));
    System.out.println("a|b = " + (a | b));
    System.out.println("a^b = " + (a ^ b));
    System.out.println("~a = " + ~a);
    a &= b;
    System.out.println("a= " + a);
}
//public static void main(String args[]) {
	//Bit on=new Bit();
	//on.bitwise_opr();
//}
}
