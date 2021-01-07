import java.util.Scanner;

/*
* Author: isabella
* Date: 6-Jan-2021
* Description: Happy or Sad
*/
public class problem2
{

	public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int happy = 0;
		int sad =0;
		for (int i=0; i<input.length(); i++) {
			if (input.charAt(i)==':' && input.charAt(i+1)=='-') {
				if (input.charAt(i+2)==')') {
				happy+=1;
				}	
				else if (input.charAt(i+2)=='(') {
				sad+=1;
				}
			}
		}
	
		
		if (happy>sad)
			System.out.println("happy");
		else if (happy<sad)
			System.out.println("sad");
		else 
			System.out.println("none");

		sc.close();
		
		
		}

}
