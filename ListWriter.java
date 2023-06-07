import java.util.Scanner;
import java.io.*;

public class ListWriter
{
	public void WriteList () throws IOException
	{
		File outputFile = new File("list.txt");
		PrintWriter pw = new PrintWriter(outputFile);
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner (System.in);
		int cap;
		String object = "";
		
		System.out.print("How many objects would you like to store? : ");
		cap = scan1.nextInt();
		
		while(cap < 1)
		{
			System.out.print("Enter a value greater than 0: ");
			cap = scan1.nextInt();
		}
		pw.println(cap);
		
		for (int i = 1; i <= cap; i++) {
			System.out.println("Enter an object: ");
			object = scan3.nextLine();
			pw.println(object);
		}

		pw.close();
		
}
}
