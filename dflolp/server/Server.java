package dflolp.server;

import dflolp.*;

public class Server
{
	public static void main(String[] args)
	{
		Common.initvars();
		Common.echo("Server initializing");
		UDPSocket s = new UDPSocket(55578);
		String[] pack = new String[3];
		Thread t = new Thread(new Console());
		t.setDaemon(true);
		t.start();
		//t.run();
		System.out.println("Packet types (Seperated by \"|\"): " + Common.p_err + ",Error|" + Common.p_sep + ",Separator|" + Common.p_ping + ",Ping|" + Common.p_pong + ",Pong|" + Common.p_quit + ",Quit");
		try
		{
			while (true)
			{
				pack = s.recvFrom("55578");
				Console.write("Got packet from (" + pack[0] + ":" + pack[2] + "): " + pack[1]);
				if(pack[1].equalsIgnoreCase("ping") || pack[1].equals(Common.p_ping))
				{
					s.sendTo(pack[0], pack[2], Common.p_pong);
					Console.write("Responding to anonymous ping with \"" + Common.p_pong + "\"");
				}
				else if (pack[1].equalsIgnoreCase(Common.p_quit))
				{
					Console.write("Shutting down");
					s.sendTo(pack[0], pack[2], Common.p_quit);
					System.exit(0);
				}
				else
				{
					s.sendTo(pack[0], pack[2], Common.p_err);
					Console.write("Unknown packet type received: \"" + pack[1] + "\".  Sending error.");
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
