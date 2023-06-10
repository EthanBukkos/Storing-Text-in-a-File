import java.util.*;
import java.io.*;

public class ListWriter
{
	private int capacity; 
	
	public static void main (String [] args) throws IOException
	{
		ListWriter list = new ListWriter();
		
		list.WriteList();
		
	}

	
	public void WriteList () throws IOException
	{
		File outputFile = new File("list.txt");
		PrintWriter pw = new PrintWriter(outputFile);
		capacity = 0;
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
			
				if (capacity < 1)
				{
					
					System.out.print("Enter a value greater than 0: ");
                
				} 
				
				else
				{
					done = true;
			
				pw.println("# of Items: " + capacity);
				}
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
		
}}
