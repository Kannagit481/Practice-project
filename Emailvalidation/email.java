package Emailvalidation;
import java.util.ArrayList;
import java.util.Scanner;
public class email 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<String> mail = new ArrayList<String>();
		mail.add("kanna481@gmail.com");
		mail.add("dude@gmail.com");
		mail.add("kannan884@gmail.com");
		mail.add("world@gmail.com");
		mail.add("friends@gmail.com");
		System.out.println("ENTER USER EMAIL ID:");
		String userId = input.nextLine();
			if (mail.contains(userId)) 
			{
				System.out.println();
				System.out.println("Email ID : " + userId + ": Valid ");
			} 
			else {
				System.out.println("Email ID : "+ userId + ": Not Valid ");

			}
		}
	}