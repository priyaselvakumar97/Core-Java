package javapractisebasic.com;

public class ForEachBreak {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for(int x:num) {
			System.out.println("The value of x is"+" "+x);
			sum +=x;
			 if (x==5) break;
		}
		
		System.out.println("The total is "+" "+sum);
		
	}

}
