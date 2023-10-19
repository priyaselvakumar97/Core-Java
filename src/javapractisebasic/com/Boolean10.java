package javapractisebasic.com;

public class Boolean10 {
public static void main (String[] args) {
	boolean b;
	b=false;
	System.out.println("The value of b is"+" " +b);
	b=true;
	System.out.println("The value of b is"+ " "+b);
	
	if (b) 
	System.out.println("This is executed");
	b=false;
	if (b)
	System.out.print("This is not executed");
	
	if(10>9) 
		System.out.println(true);
		
}
}
