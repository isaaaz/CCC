import java.util.Scanner;

/*
* Author: isabella
* Date: 7-Jan-2021
* Description: Time to Decompress
*/
public class problem3
{

	public static void main(String[] args)
		{
		Scanner sc = new Scanner (System.in);
		
		int lineNum = sc.nextInt();
		
		int[] num = new int[lineNum];
		String[] word = new String[lineNum];
		
		
		for (int i=0; i<lineNum; i++) 
		{
			num[i] = sc.nextInt();
			word[i] = sc.next();
		}
		
		for (int i=0; i<lineNum; i++)  {
			for (int j=0; j<num[i]; j++)  {
			System.out.print(word[i]);
		}
			System.out.println();
		} 
		
		sc.close();
		
		
	

		}

}
