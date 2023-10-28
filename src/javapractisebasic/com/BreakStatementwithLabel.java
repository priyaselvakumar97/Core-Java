package javapractisebasic.com;

public class BreakStatementwithLabel {

	public static void main(String[] args) {
	boolean t=true;
	
		first: {
			second: {
				third: {
					System.out.println("Before the break");
					if(t) break second; // breaks second block
					System.out.println("This wont execute");
			
				}
				System.out.println("This wont execute");
				
			}
			System.out.println("This will execute");
			
		}

	}

}
