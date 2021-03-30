// Lab12avst.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		MagpieLab12a maggie = new MagpieLab12a();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}


class MagpieLab12a
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0
				|| statement.indexOf("family") >= 0
				|| statement.indexOf("parent") >= 0)
		{
			ArrayList<String> responses = new ArrayList<>();
			responses.add("Tell Me more about your family");
			responses.add("Your family seems cool");
			responses.add("Does your family watch tv when eating dinner?");
			responses.add("Where does your family live?");
			responses.add("Do you have any family pets");
			responses.add("Do you go on family picnics");
			responses.add("How many sibilings do you have?");
			responses.add("How old are your sibilings");
			responses.add("Are you the middle, older, or younger child?");
			responses.add("How is your family like?");

			double r = Math.random();
			response = responses.get(((int)(r * 10)));
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 10;
		String responses[] = {"Interesting, tell me more.", "Hmmm, thats cool", "Do you really think so?", "Could you elaborate?", "why?", "Ok, that's cool", "Could you give more details about that?", "Why is that so?", "Are you sure?", "How did it go"};
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		return responses[whichResponse];
	}
}
