package dflolp.server;

import dflolp.*;
import dflolp.server.*;

public class Server
{
	public static void main(String[] args)
	{
		Common.echo("Server initializing");
		UDPSocket s = new UDPSocket();
		String[] pack = new String[3];
		Thread t = new Thread(new Console());
		t.setDaemon(true);
		t.start();
		//t.run();
		System.out.println("Derp");
		try
		{
			while (true)
			{
				pack = s.recvFrom("55562");
				Console.write("Got packet from (" + pack[0] + ":" + pack[2] + "): " + pack[1]);
				if(pack[1].equalsIgnoreCase("ping"))
				{
					s.sendTo(pack[0], pack[2], "pong");
					Console.write("Sent back: " + "pong");
				}
				else if (pack[1].equalsIgnoreCase("shutdown"))
				{
					Console.write("Shutting down");
					s.sendTo(pack[0], pack[2], "shutdown");
					System.exit(0);
				}
				else
				{
					s.sendTo(pack[0], pack[2], "dflolp.UnknownCommandException");
					Console.write("Sent back: " + "dflolp.UnknownCommandException");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println(pack[1]);
	}
}
