import java.util.Scanner;

/*
* Author: isabella
* Date: 6-Jan-2021
* Description: Problem J1: Winning Score
*/
public class problem1
{

	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int apples3 = sc.nextInt();
			int apples2 = sc.nextInt();
			int apples1 = sc.nextInt();
			int bananas3 = sc.nextInt();
			int bananas2 = sc.nextInt();
			int bananas1 = sc.nextInt();
			
			if (apples3*3 + apples2*2 + apples1 > bananas3*3 + bananas2*2 + bananas1) {
				System.out.println("A");
			}
			else if (apples3*3 + apples2*2 + apples1 < bananas3*3 + bananas2*2 + bananas1) {
				System.out.println("B");
			}
			else {
				System.out.println("T");
			}
			
			
			sc.close();
			
		}

}
