package javapractisebasic.com;
public class ClassBox4 {
	public static void main(String[] args) {
		
		ClassBox4 mybox1=new ClassBox4();
		ClassBox4 mybox2=new ClassBox4();
		double vol;
		
//		   Assign values to mybox1's instance variables
		mybox1.width=10;
		mybox1.height=20;
		mybox1.depth=15;
		
//         Assign values to mybox2's instance variables
		mybox2.width=3;
		mybox2.height=6;
		mybox2.depth=9;

//        get volume of first box
		vol=mybox1.volume();
		System.out.print("Volume is"+vol);
		
//        get volume of second box
		vol=mybox2.volume();
		System.out.println("Volume is"+vol);
		
		
	}

}
