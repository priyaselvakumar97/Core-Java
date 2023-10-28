package javapractisebasic.com;

public class NestedLoopAndBreakStatement {

	public static void main(String[] args) {
		int i,j;
		      for(i=0;i<3;i++) {
		    	 System.out.print("pass"+i+" :");
		    	  for(j=0;j<100;j++) {
		    		  if(j==10) break;
		    	  System.out.print(j);
		    	    
		      }	
		    	  System.out.println();
		 }
	}

}
