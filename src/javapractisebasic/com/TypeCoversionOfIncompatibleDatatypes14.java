package javapractisebasic.com;

public class TypeCoversionOfIncompatibleDatatypes14 {
	
	public static void main(String[] agrs) {
		byte b;
		int i=257;
		double d=323.142;
		
		//conversion of int into byte
		
		b=(byte)i;
		System.out.println(b);
		// conversion of byte to double
		d=(double) b;
		System.out.println(d);
		
		//conversion of double to int
		i=(int)d;
		System.out.println(i);
		
	}
 
}
