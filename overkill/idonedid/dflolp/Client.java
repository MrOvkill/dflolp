package overkill.idonedid.dflolp;

import org.newdawn.slick.AppGameContainer;

import dflolp.*;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
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
