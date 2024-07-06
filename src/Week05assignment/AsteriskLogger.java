package Week05assignment;

public class AsteriskLogger implements Logger {
	//Implement the AsteriskLogger methods:  
	//Note:  The AsteriskLogger will use the asterisk or "*".
		
	
	@Override
	public void error(String str2){
	System.out.println("*********");
	System.out.println("***Error:" + str2 + "***");	
	System.out.println("*********");	
	}

	@Override
	public void log(String str1) {
	System.out.println("***" + str1 + "***");
		
	}
	}

	//public class AdditionOperation implements MathOperation {

		//@Override
		//public double evaluate(double num1, double num2) {
		//return num1 + num2;
	
	
		

	

