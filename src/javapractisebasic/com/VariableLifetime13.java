package javapractisebasic.com;
//Lifetime variable demo
public class VariableLifetime13 {
	public static void main(String[] args) {
		int x;
		for(x=0;x<3;x++) {
			int y=-1;
	
			System.out.println("The Value of Y is"+" "+y);
			y=100;
			System.out.println("The value of Y is"+" "+y);
			
		}
		
		
	}

}
