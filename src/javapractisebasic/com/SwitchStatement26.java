package javapractisebasic.com;

public class SwitchStatement26 {
	
	public static void main(String[] args) {
		int i=0;
		for(i=0;i<6;i++) {
			switch(i) {
			
			case 0:
				System.out.println("The value of i is"+" "+i);
			    break;
			case 1:
				System.out.println("The value of i is"+" "+i);
			    break;
			case 2:
				System.out.println("the value of i is "+ " "+i);
				break;
			case 3:
				System.out.println("The value of i is"+" "+i);
			    break;
//			case 4:
//				System.out.println("The value of i is"+" "+i);
//				break;
			default:
				System.out.println("The value of i is greater than Three (3)");
			}
		}
		
	}
}
