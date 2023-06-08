import java.util.*;
import java.io.*;

public class ListWriter
{
	private int capacity; 
	
	public void WriteList () throws IOException
	{
		File outputFile = new File("list.txt");
		PrintWriter pw = new PrintWriter(outputFile);
		Scanner scanCapacity = new Scanner(System.in);
		Scanner scanObject = new Scanner(System.in);
		String object = "";
		boolean done = false;
		
		System.out.print("How many objects would you like to store? : ");
		
		while (!done)
		{
			
			try
			{
				capacity = scanCapacity.nextInt();
			
				while(capacity < 1)
				{
					done = true;
					System.out.print("Enter a value greater than 0: ");
					capacity = scanCapacity.nextInt();
				}
			
				pw.println("# of Items: " + capacity);
			}
		
			catch (InputMismatchException  ime )
			{	
				scanCapacity.nextLine();
				System.out.println("You entered bad data. ");
				System.out.print("Try again: ");
			}
		}
		
		for (int i = 0; i < capacity; i++)
		{
			System.out.print("Enter an object: ");
			object = scanObject.nextLine();
			pw.println(object);
		}
			pw.close();	
	}
}
