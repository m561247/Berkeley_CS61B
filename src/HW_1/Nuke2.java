package HW_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nuke2 {
	public static void main(String[] args) throws IOException {
		BufferedReader keyboard;
		String inputLine;

		keyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.flush(); /* Make sure the line is printed immediately. */
		inputLine = keyboard.readLine();
		StringBuilder sb = new StringBuilder();
		char[] chars = inputLine.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i != 1) {
				sb.append(chars[i]);
			}
		}
		System.out.println(sb.toString());
	}
}
