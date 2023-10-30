package javapractisebasic.com;

public class Class {

	public static void main(String[] args) {
		int Box;
		Box myBox =new Box();
		double vol;
		
		myBox.width=10;
		myBox.height =20;
		myBox.depth =15;
		
		vol=myBox.width*myBox.height*myBox.depth;
		System.out.println("Volume is"+vol);
		
	}

}
