package javapractisebasic.com;
public class ForEachLoopSearch {
    
	 public static void main(String[] args) {
		 int num[]= {1,2,3,4,5,6,7,8,9,10};
		 boolean found = false;
		 int value=11;
		 
		 for(int x:num) {
			 if(x==value) {
				 found=true;
				 break;
			 }
			 
		 }
		 
		 if(found) {
			 System.out.println("Value found !");
		 }else
			 System.out.println("value not found!");
			
		 
	 }
	
	
	
}
