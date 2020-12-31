package HW_1;

import java.io.*;
import java.net.URL;

public class OpenCommercial {
	/**
	 * Prompts the user for the name X of a company (a single string), opens the Web
	 * site corresponding to www.X.com, and prints the first five lines of the Web
	 * page in reverse order.
	 * 
	 * @param arg is not used.
	 * @exception Exception thrown if there are any problems parsing the user's
	 *                      input or opening the connection.
	 */
	public static void main(String[] arg) throws Exception {

		BufferedReader keyboard;
		String inputLine;

		keyboard = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please enter the name of a company (without spaces): ");
		System.out.flush(); /* Make sure the line is printed immediately. */
		inputLine = keyboard.readLine();
		
		/* Replace this comment with your solution. */
		String address =  "https://www." + inputLine + ".com";
		String[] firstFiveLines = new String[5];
		URL aUrl = new URL(address);
		BufferedReader urlContent = new BufferedReader(new InputStreamReader(aUrl.openStream()));
		String oneInputLine;
		int i = 0;
		while ((oneInputLine = urlContent.readLine()) != null && i < firstFiveLines.length) {
			firstFiveLines[i] = oneInputLine;
			i++;
		}
		for (int j = firstFiveLines.length - 1; j >= 0; j--) {
			System.out.println(firstFiveLines[j]);
		}
		
	}
}
