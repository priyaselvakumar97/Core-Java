package javapractisebasic.com;

public class SwitchStatementBreak28 {
	public static void main(String[] args) {
		int month=5;
		String season;
		switch(month) {
		     case 3:
		     case 4:
		     case 5:
		    	 season="Spring";
		         break;
		     case 12:
		     case 1:
		     case 2:
		    	  season="winter";
		    	  break;
		     case 6:
		     case 7:
		     case 8:
		    	  season="Summer";
		    	  break;
		     case 9:
		     case 10:
		     case 11:
		    	  season="Autumn";
		    	  break;
		    default:
		    	season="Bogus Month";
		    }	
		     System.out.println("The season of Month May is "+ " "+season);
	}

}
