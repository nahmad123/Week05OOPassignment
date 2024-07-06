package Week05assignment;

public class App {

	public static void main(String[] args) {
		/* Instantiate your implementing classes here
		 */
			
		//Implement the AsteriskLogger methods:  
		//Note:  The AsteriskLogger will use the asterisk or "*".
		 AsteriskLogger print = new AsteriskLogger();
		 SpacedLogger print1 = new SpacedLogger();
		 print.log("Hello");
		 print.error("Hello");
		 
		//Implement the SpacedLogger methods:
		//Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.
		print1.log("Hello123");
		print1.error("Hello123");
		

		 
		 
	
	}

}
