package javapractisebasic.com;

public class VariableTypeInference {

	public static void main(String[] args) {
		for(double x=2.5;x<100;x=x*2) {
			System.out.println(x);
		}
}

}
// in type inference we can directly use variable to declare values instead of giving datatypes ,
//the JDK itself takes the datatypes based on the initializer.Here we have old version so its not compiling.
