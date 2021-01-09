import java.util.Scanner;

/*
* Author: isabella
* Date: 8-Jan-2021
* Description: Occupy parking 
*/
public class problem4
{

	public static void main(String[] args)
		{
			Scanner sc = new Scanner (System.in);
			int input = sc.nextInt();
			String first = sc.next();
			String second = sc.next();
			
			int sum = 0;
			for (int i=0; i<input;i++) {
				if(first.charAt(i)==second.charAt(i) && first.charAt(i)=='C') {
					sum+=1;
					
				}
				
			}
			System.out.println(sum);

			sc.close();
		}


}
