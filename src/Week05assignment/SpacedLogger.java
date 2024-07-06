package Week05assignment;

import java.io.PrintStream;

public class SpacedLogger implements Logger {

	@Override
	public void log(String str1) {

		StringBuilder result = new StringBuilder();

		for(int i = 0 ; i < str1.length(); i++)
		{
		   result = result.append(str1.charAt(i));
		   if(i == str1.length()-1)
		      break;
		   result = result.append(' ');
		}

		System.out.println(result.toString());

	}

	@Override
	public void error(String str2) {
		StringBuilder result = new StringBuilder();

		for(int i = 0 ; i < str2.length(); i++)
		{
		   result = result.append(str2.charAt(i));
		   if(i == str2.length()-1)
		      break;
		   result = result.append(' ');
		}
		System.out.println("ERROR:" + result);
		
	}
	
}


