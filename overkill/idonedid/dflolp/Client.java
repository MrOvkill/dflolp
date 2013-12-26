package overkill.idonedid.dflolp;

import org.newdawn.slick.AppGameContainer;

import dflolp.*;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			/*

			System.out.print("Measuring server ping... ");
			long a = System.currentTimeMillis();
			UDPSocket s = new UDPSocket();
			s.sendTo("overkill.idonedid.com", "55578", Common.p_ping);
			s.recvFrom("55578");
			long b = System.currentTimeMillis();
			System.out.println("" + (b - a) + "MS");
			
			*/
			
			
			
			AppGameContainer appgc;
			appgc = new AppGameContainer(new Game("Die From Lack Of Lead Poisoning"));
			appgc.setDisplayMode(800, 600, false);
			appgc.setShowFPS(false);
			appgc.setMaximumLogicUpdateInterval(60);
			appgc.start();
			
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
