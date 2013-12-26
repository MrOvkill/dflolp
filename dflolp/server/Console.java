package dflolp.server;

import java.io.*;

import dflolp.Common;

public class Console implements Runnable 
{
	public static void newline()
	{
		System.out.println("");
		System.out.print(">");
	}
	public static void write(String toWrite)
	{
		System.out.println("");
		Common.echo(toWrite);
		System.out.print(">");
	}
	@Override
	public void run()
	{
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String line;
			System.out.print(">");
			while ((line = in.readLine()) != null)
			{
				Common.echo("Console command sent: " + line);
				String[] args = line.split(" ");
				if (args[0].equalsIgnoreCase("exit") || args[0].equalsIgnoreCase("quit") || args[0].equalsIgnoreCase("shutdown"))
				{
					System.out.println("Exiting!");
					System.exit(0);
				}
				System.out.print(">");
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
